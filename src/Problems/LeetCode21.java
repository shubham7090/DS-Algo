package Problems;

import helper.ListNode;

public class LeetCode21 {

    public static void run(){
        int[] arr1 = {1,2,4};
        int[] arr2 = {1,3,4};
        ListNode head1 = ListNode.createFromArray(arr1);
        ListNode.display(head1);
        ListNode head2 = ListNode.createFromArray(arr2);
        ListNode.display(head2);
        ListNode head = mergeTwoLists(head2,head1);
        ListNode.display(head);
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode curr1=list1,curr2=list2;
        ListNode tempHead = new ListNode(-1);
        ListNode curr = tempHead;//temp head;

        while(curr1!=null&&curr2!=null){
            ListNode newNode;
            if(curr1.val<curr2.val){
                newNode = new ListNode(curr1.val);
                curr1 = curr1.next;
            }else{
                newNode = new ListNode(curr2.val);
                curr2 = curr2.next;
            }
            curr.next=newNode;
            curr = curr.next;
        }

        while(curr1!=null){
            curr.next = new ListNode(curr1.val);
            curr1 = curr1.next;
            curr = curr.next;
        }
        while(curr2!=null){
            curr.next = new ListNode(curr2.val);
            curr2 = curr2.next;
            curr = curr.next;
        }

        return tempHead.next;
    }
}
