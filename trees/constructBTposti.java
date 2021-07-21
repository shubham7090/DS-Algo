import java.util.Scanner;

public class constructBTposti {
    public static Scanner scn = new Scanner(System.in);

    public static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public static TreeNode buildTree(int[] inorder, int[] postorder) {
        return construct(inorder,0,inorder.length-1,postorder,0,postorder.length-1);
    }
    public static TreeNode construct(int[] inorder,int isi,int iei,int[] postorder,int psi,int pei){
        if(isi>iei)return null;
        TreeNode root=new TreeNode(postorder[pei]);
        int idx=isi;
        while(inorder[idx]!=postorder[pei])idx++;
        
        root.left=construct(inorder,isi,idx-1,postorder,psi,psi+idx-isi-1);
        root.right=construct(inorder,idx+1,iei,postorder,psi+idx-isi,pei-1);
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
        int[] post = new int[n];
        for (int i = 0; i < n; i++)
            post[i] = scn.nextInt();

        int[] in = new int[n];
        for (int i = 0; i < n; i++)
            in[i] = scn.nextInt();

        TreeNode root = buildTree(in, post);
        display(root);
    }

    public static void main(String[] args) {
        solve();
    }
}