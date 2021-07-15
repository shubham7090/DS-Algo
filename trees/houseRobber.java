import java.util.Scanner;

public class houseRobber {
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
        int with;
        int without;
        Pair(int with,int without){
            this.with=with;
            this.without=without;
        }
    }
    public static int HouseRobber(TreeNode root) {
        Pair ans = calculate(root);
        return Math.max(ans.with,ans.without);
    }
    public static Pair calculate(TreeNode root){
        if(root==null){
            return new Pair(0,0);
        }
        Pair lp=calculate(root.left);
        Pair rp=calculate(root.right);
        return new Pair(lp.without+rp.without+root.val,Math.max(lp.with,lp.without)+Math.max(rp.with,rp.without));
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
        System.out.println(HouseRobber(root));
    }

    public static void main(String[] args) {
        solve();
    }
}