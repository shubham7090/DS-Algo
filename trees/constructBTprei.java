import java.util.Scanner;

public class constructBTprei {
    public static Scanner scn = new Scanner(System.in);

    public static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        TreeNode(int val) {
            this.val = val;
        }
    }
    public static TreeNode buildTree(int[] preorder, int[] inorder) {
        return construct(inorder,0,inorder.length-1,preorder,0,preorder.length-1);
    }
    public static TreeNode construct(int[] inorder,int isi,int iei,int[] preorder,int psi,int pei){
        if(isi>iei||psi>pei)return null;
        TreeNode root=new TreeNode(preorder[psi]);
        int idx=isi;
        while(inorder[idx]!=preorder[psi])idx++;
        int countofleftsubtree=idx-isi;
        root.left=construct(inorder,isi,idx-1,preorder,psi+1,psi+countofleftsubtree);
        root.right=construct(inorder,idx+1,iei,preorder,psi+countofleftsubtree+1,pei);
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

        int[] in = new int[n];
        for (int i = 0; i < n; i++)
            in[i] = scn.nextInt();

        TreeNode root = buildTree(pre, in);
        display(root);
    }

    public static void main(String[] args) {
        solve();
    }
}