package Problems;

import helper.ListNode;

public class LeetCode876 {
    public static void run(){
        int[] arr = {1,2,3};
        ListNode head = ListNode.createFromArray(arr);
        ListNode middle = middleNode(head);
        System.out.println(middle.val);
    }
    public static ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
}
