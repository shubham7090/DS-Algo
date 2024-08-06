package Problems;

import helper.ListNode;

public class LeetCode1290 {
    public static void run(){
        int[] arr = {1, 1, 0, 0, 1};
        ListNode head = ListNode.createFromArray(arr);
        System.out.println(getDecimalValue(head));
    }

    public static int getDecimalValue(ListNode head) {
        int ans =0 ;
        while(head!=null){
            int digit = head.val;
            ans<<=1;
            ans|=digit;
            head = head.next;
        }
        return ans;
    }
}
