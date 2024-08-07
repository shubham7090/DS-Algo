package Problems;

import helper.ListNode;

import static Problems.LeetCode21.mergeTwoLists;

public class LeetCode148 {

    public static void run(){
        int[] arr = {4,2,1,3,5};
        ListNode head = ListNode.createFromArray(arr);
        ListNode sortedHead = mergeSort(head);
        ListNode.display(sortedHead);;
    }

    public static ListNode mergeSort(ListNode head){
        if(head==null || head.next==null)return head;

        ListNode mid = LeetCode876.middleNode(head);
        ListNode midNext = mid.next;
        mid.next=null;
        System.out.print("Left : ");ListNode.display(head);
        System.out.print("right : ");ListNode.display(midNext);
        ListNode left = mergeSort(head);
        ListNode right = mergeSort(midNext);

        return mergeTwoLists(left,right);
    }

    public static ListNode firstMiddle(ListNode head){
        ListNode slow=head;
        ListNode fast = head;
        ListNode slowPrev = null;
        while(fast!=null && fast.next!=null){
            slowPrev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        return slowPrev;
    }
}
