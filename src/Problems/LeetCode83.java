package Problems;

import helper.ListNode;

public class LeetCode83 {
    public static void run(){
        int[] arr = {1,1,2,3,3};
        ListNode head = ListNode.createFromArray(arr);
        ListNode.display(deleteDuplicates(head));
    }

    public static ListNode deleteDuplicates(ListNode head) {
        ListNode temp=head;
        while(temp!=null && temp.next!=null){
            if(temp.next.val==temp.val){
                temp.next=temp.next.next;
            }else{
                temp = temp.next;
            }
        }

        return head;
    }
}
