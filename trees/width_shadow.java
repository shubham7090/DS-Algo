import java.util.*;

public class width_shadow {
    public static Scanner scn = new Scanner(System.in);

    public static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public static int width(TreeNode root) {
       int[] arr=new int[2];
       width(root,0,arr);//at index0 it is min horizontal level and at index 1 it is max horizontal level;
       return arr[1]-arr[0]+1;
    }
    public static void width(TreeNode root,int lvl,int[] arr){
        if(root==null)return;
        arr[0]=Math.min(arr[0],lvl);
        arr[1]=Math.max(arr[1],lvl);
        width(root.left,lvl-1,arr);
        width(root.right,lvl+1,arr);
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

        System.out.println(width(root));
    }

    public static void main(String[] args) {
        solve();
    }
}