import java.util.*;

public class topView {
    public static Scanner scn = new Scanner(System.in);

    public static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        TreeNode(int val) {
            this.val = val;
        }
    }
    public static class Pair{
        TreeNode node;
        int lvl;
        Pair(TreeNode node,int lvl){
            this.node=node;
            this.lvl=lvl;
        }
    }
    public static ArrayList<Integer> TopView(TreeNode root) {
        int[] helparr=new int[2];
        width(root,0,helparr);
        int width=helparr[1]-helparr[0]+1;
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<width;i++)arr.add(null);
        LinkedList<Pair> q=new LinkedList<>();
        q.add(new Pair(root,Math.abs(helparr[0])));
        while(q.size()>0){
            int size=q.size();
            while(size-->0){
                Pair tp=q.removeFirst();
                if(arr.get(tp.lvl)==null)arr.set(tp.lvl,tp.node.val);
                if(tp.node.left!=null)q.addLast(new Pair(tp.node.left,tp.lvl-1));
                if(tp.node.right!=null)q.addLast(new Pair(tp.node.right,tp.lvl+1));
            }
        }
        
        return arr;
    }
    public static void width(TreeNode node,int lvl,int[] arr){
        if(node==null)return;
        arr[0]=Math.min(arr[0],lvl);
        arr[1]=Math.max(arr[1],lvl);
        width(node.left,lvl-1,arr);
        
        width(node.right,lvl+1,arr);
    }

    // input_section=================================================

    public static TreeNode createTree(int[] arr, int[] IDX) {
        if (IDX[0] > arr.length || arr[IDX[0]] == -1) {
            IDX[0]++;
            return null;
        }
        TreeNode node = new TreeNode(arr[IDX[0]++]);
        node.left = createTree(arr, IDX);
        node.right = createTree(arr, IDX);

        return node;
    }

    public static void solve() {
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = scn.nextInt();

        int[] IDX = new int[1];
        TreeNode root = createTree(arr, IDX);

        ArrayList<Integer> ans = TopView(root);
        for (Integer i : ans)
            System.out.print(i + " ");

    }

    public static void main(String[] args) {
        solve();
    }
}