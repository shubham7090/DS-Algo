import java.util.Scanner;

public class constructBSTpost {
    public static Scanner scn = new Scanner(System.in);

    public static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        TreeNode(int val) {
            this.val = val;
        }
    }
    static int idx;
    public static TreeNode bstFromPostorder(int[] postorder) {
        idx=postorder.length-1;
        return construct(postorder,-(int)1e9-1,(int)1e9+1);
    }
    public static TreeNode construct(int[] postorder,int ll,int rl){
        if(idx<0||postorder[idx]<ll||postorder[idx]>rl)return null;
        TreeNode root=new TreeNode(postorder[idx--]);
        root.right=construct(postorder,postorder[idx+1],rl);
        root.left=construct(postorder,ll,postorder[idx+1]);
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
        int[] pre = new int[n];
        for (int i = 0; i < n; i++)
            pre[i] = scn.nextInt();

        TreeNode root = bstFromPostorder(pre);
        display(root);
    }

    public static void main(String[] args) {
        solve();
    }
}