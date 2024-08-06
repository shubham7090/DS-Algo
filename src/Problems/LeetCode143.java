package Problems;

import helper.ListNode;

import static Problems.LeetCode206.reverseList;
import static Problems.LeetCode876.middleNode;

public class LeetCode143 {

    public static void run(){
        int[] arr = {1,2,3,4,5};
        ListNode head = ListNode.createFromArray(arr);
        reorderList(head);
        ListNode.display(head);
    }

    public static void reorderList(ListNode head) {
        ListNode mid=middleNode(head);
        ListNode revHead=reverseList(mid.next);
        mid.next=null;

        ListNode ptr1=head,ptr2=revHead;
        while(ptr1!=null&&ptr2!=null){
            ListNode next1=ptr1.next;
            ListNode next2=ptr2.next;
            ptr1.next=ptr2;
            ptr2.next=next1;
            ptr1=next1;
            ptr2=next2;
        }
    }
}
