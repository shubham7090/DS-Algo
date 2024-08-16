package Problems;

import helper.ListNode;

public class LeetCode2 {

    public static void run(){
        int[] arr1 = {2,4,3};
        ListNode head1= ListNode.createFromArray(arr1);
        int[] arr2 = {5,6,4};
        ListNode head2= ListNode.createFromArray(arr2);
        ListNode added = addTwoNumbers(head1,head2);
        ListNode.display(added);
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1==null)return l2;
        if(l2==null) return l1;
        ListNode ansHead = new ListNode();
        ListNode curr = ansHead;

        ListNode curr1 = l1,curr2=l2;
        int carry =0;

        while(curr1!=null&&curr2!=null){
            int sum = curr1.val+curr2.val+carry;
            curr.next = new ListNode(sum%10);
            carry = sum/10;
            curr1 = curr1.next;
            curr2 = curr2.next;
            curr = curr.next;
        }

        while(curr1!=null){
            int sum = curr1.val+carry;
            curr.next = new ListNode(sum%10);
            carry = sum/10;
            curr1 = curr1.next;
            curr = curr.next;
        }

        while(curr2!=null){
            int sum = curr2.val+carry;
            curr.next = new ListNode(sum%10);
            carry = sum/10;
            curr2 = curr2.next;
            curr = curr.next;
        }

        if(carry>0)curr.next = new ListNode(carry);

        return ansHead.next;
    }
}
