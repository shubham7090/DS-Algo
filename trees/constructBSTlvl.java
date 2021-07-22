import java.util.*;

public class constructBSTlvl {
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
        TreeNode parent;
        int ll;
        int rl;
        public Pair(TreeNode node,int ll,int rl){
            this.ll=ll;
            this.rl=rl;
            this.parent=node;
        }
    }
    public static TreeNode constructBSTFromLevelOrder(int[] LevelOrder) {
        TreeNode root=null;
        LinkedList<Pair> q=new LinkedList<>();
        q.add(new Pair(null,-(int)1e9-1,(int)1e9+1));
        int idx=0;
        while(idx<LevelOrder.length){
            Pair tp=q.removeFirst();
            if(tp.ll<LevelOrder[idx]&&tp.rl>LevelOrder[idx]){
                TreeNode node=new TreeNode(LevelOrder[idx]);
                
                if(tp.parent==null){
                    root=node;
                }else if(tp.parent.val==tp.rl)tp.parent.left=node;
                else tp.parent.right=node;
                
                q.add(new Pair(node,tp.ll,node.val));
                q.add(new Pair(node,node.val,tp.rl));
                idx++;
            }
        }
        return root;
    }
    
    // input_section=================================================

    public static void display(TreeNode node) {
        if (node == null)
            return;

        StringBuilder sb = new StringBuilder();
        sb.append((node.left != null ? node.left.val : "."));
        sb.append(" -> " + node.val + " <- ");
        sb.append((node.right != null ? node.right.val : "."));

        System.out.println(sb.toString());

        display(node.left);
        display(node.right);

    }

    public static void solve() {
        int n = scn.nextInt();
        int[] level = new int[n];
        for (int i = 0; i < n; i++)
            level[i] = scn.nextInt();

        TreeNode root = constructBSTFromLevelOrder(level);
        display(root);
    }

    public static void main(String[] args) {
        solve();
    }
}