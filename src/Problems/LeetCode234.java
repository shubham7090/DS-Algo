package Problems;

import helper.ListNode;

import static Problems.LeetCode206.reverseList;
import static Problems.LeetCode876.middleNode;

public class LeetCode234 {

    public static void run(){
        int[] arr = {1,2,3,3,2,1};
        ListNode head = ListNode.createFromArray(arr);
        System.out.println(isPalindrome(head));
    }

    public static boolean isPalindrome(ListNode head) {
        ListNode mid = middleNode(head);
        ListNode headSecond = reverseList(mid);
        ListNode reverseHead = headSecond;
        while(head!=null&&headSecond!=null){
            if(head.val != headSecond.val){
                break;
            }
            head = head.next;
            headSecond = headSecond.next;
        }
        reverseList(headSecond);

        return head==null || headSecond == null;

    }
}
