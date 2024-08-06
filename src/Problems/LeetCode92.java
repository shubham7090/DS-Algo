package Problems;

import helper.ListNode;

public class LeetCode92 {

    public static void run(){
        int[] arr = {1, 2, 3, 4, 5};
        ListNode head = ListNode.createFromArray(arr);
        head = reverseBetween(head,2,4);
        ListNode.display(head);
    }

    public static ListNode reverseBetween(ListNode head, int left, int right) {
        if(left==right)return head;

        //skipping left-1 nodes
        ListNode present = head,prev=null;
        for(int i=0;present!=null&&i<left-1;i++){
            prev=present;
            present=present.next;
        }

        ListNode last = prev;
        ListNode newEnd = present;

        //reverse b/w left and right
        ListNode next = present.next;
        for(int i=0;present!=null&&i<right-left+1;i++){
            present.next = prev;
            prev = present;
            present = next;
            if(next!=null)next=next.next;
        }

        if(last!=null)last.next=prev;
        else head=prev;

        newEnd.next=present;

        return head;
    }
}
