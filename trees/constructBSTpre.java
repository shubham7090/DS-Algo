import java.util.Scanner;

public class constructBSTpre {
    public static Scanner scn = new Scanner(System.in);

    public static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        TreeNode(int val) {
            this.val = val;
        }
    }
    static int idx=0;
    public static TreeNode construct(int[] preorder,int ll,int rl ){
        if(idx>=preorder.length||preorder[idx]<ll||preorder[idx]>rl)return null;
        TreeNode root=new TreeNode(preorder[idx]);
        // int val=preorder[idx];
        idx++;
        root.left=construct(preorder,ll,preorder[idx-1]);
        root.right=construct(preorder,preorder[idx-1],rl);
        return root;
    }
    public static TreeNode bstFromPreorder(int[] preorder) {
        return construct(preorder,-(int)1e9-1,(int)1e9+1);
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
        int[] pre = new int[n];
        for (int i = 0; i < n; i++)
            pre[i] = scn.nextInt();

        TreeNode root = bstFromPreorder(pre);
        display(root);
    }

    public static void main(String[] args) {
        solve();
    }
}