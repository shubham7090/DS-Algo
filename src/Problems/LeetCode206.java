package Problems;

import helper.ListNode;

public class LeetCode206 {

    public static void run(){
        int[] arr = {1,2,3,4,5,6};
        ListNode head = ListNode.createFromArray(arr);
        head = reverseList(head);
        ListNode.display(head);
    }
    public static ListNode reverseList(ListNode head) {
        if(head == null || head.next==null)return head;

        ListNode prev=null;
        while(head!=null){
            ListNode curr = head.next;
            head.next = prev;
            prev = head;
            head = curr;
        }
        return prev;
    }
}
