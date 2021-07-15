import java.util.Scanner;

public class cameraInBinaryTree {
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
        int status;
        int ans;
        Pair(int status,int ans){
            this.ans=ans;
            this.status=status;
        }
        // 0-> need a camera
        // 1-> i am camera
        // 2-> i am covered
    }

    public static int MinCamerasInBT(TreeNode root) {
        Pair ans=calculateCamera(root);
        if(ans.status==0)return ans.ans+1;
        else return ans.ans;
    }
    public static Pair calculateCamera(TreeNode root){
        if(root==null)return new Pair(2,0);
        Pair lp=calculateCamera(root.left);
        Pair rp=calculateCamera(root.right);
        if(lp.status==0||rp.status==0)return new Pair(1,lp.ans+rp.ans+1);//placing a camera
        else if(lp.status==1||rp.status==1) return new Pair(2,lp.ans+rp.ans);//no camera and it is covered;
        else return new Pair(0,lp.ans+rp.ans);//need a camera
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
        System.out.println(MinCamerasInBT(root));

    }

    public static void main(String[] args) {
        solve();
    }
}