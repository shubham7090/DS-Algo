import java.util.Scanner;

public class longestZigZagPath {
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
        int leftSlash;
        int rightSlash;
        int max;
        public Pair(int lftSlash,int rightSlash,int max ){
            this.leftSlash=lftSlash;
            this.rightSlash=rightSlash;
            this.max=max;
        }
    }
    public static Pair longestZigZagPathCalc(TreeNode root){
        if(root==null)return new Pair(-1,-1,0);//in terms of edges.
        
        Pair lp=longestZigZagPathCalc(root.left);
        Pair rp=longestZigZagPathCalc(root.right);
        int mymax=Math.max(Math.max(lp.max,rp.max),Math.max(lp.rightSlash+1,rp.leftSlash+1));
        return new Pair(lp.rightSlash+1,rp.leftSlash+1,mymax);
            
    }
    public static int longestZigZagPath(TreeNode root) {
        
        return longestZigZagPathCalc(root).max;
    }

    // input_Section_====================================================================

    public static TreeNode createTree(int[] arr, int[] IDX) {
        if (IDX[0] > arr.length || arr[IDX[0]] == -1){
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

        System.out.println(longestZigZagPath(root));
    }

    public static void main(String[] args) {
        solve();
    }
}