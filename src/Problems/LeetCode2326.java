package Problems;

import helper.ArrayHelpers;
import helper.ListNode;

import static helper.ListNode.createFromArray;

public class LeetCode2326 {
    public static void run(){
        ListNode head = createFromArray(new int[]{0,1,2});
        ArrayHelpers.print2DArray(spiralMatrix(1,4,head));
    }

    public static int[][] spiralMatrix(int m, int n, ListNode head) {
        int[][] matrix = new int[m][n];
        ListNode curr = head;
        int top = 0,left=0,bottom=m-1,right=n-1;
        while(top<=bottom && left<=right){
            for(int i=left;i<=right;i++){
                if(curr!=null){
                    matrix[top][i] = curr.val;
                    System.out.println("top : "+top+"i:"+i+"val:"+curr.val);
                    curr = curr.next;
                }else matrix[top][i] = -1;
            }
            top++;

            for(int i=top;i<=bottom;i++){
                if(curr!=null){
                    matrix[i][right] = curr.val;
                    curr = curr.next;
                }else matrix[i][right] = -1;
            }
            right--;

            if(top<=bottom){
                for(int i=right;i>=left;i--){
                    if(curr!=null){
                        matrix[bottom][i] = curr.val;
                        curr = curr.next;
                    }else matrix[bottom][i] = -1;
                }
                bottom--;
            }

            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    if(curr!=null){
                        matrix[i][left] = curr.val;
                        curr = curr.next;
                    }else matrix[i][left] = -1;
                }
                left++;
            }
        }
        return matrix;
    }
}
