package Problems;

import helper.ListNode;

public class LeetCode61 {

    public static void run(){
        int[] arr = {1,2,3,4,5};
        ListNode head = ListNode.createFromArray(arr);
        ListNode.display(rotateRight(head,3));
    }

    public static ListNode rotateRight(ListNode head, int k) {
        if(k==0 || head == null)return head;
        int len = 0;
        ListNode tail = null,curr=head;

        while(curr!=null){
            tail=curr;
            len++;
            curr=curr.next;
        }

        k%=len;
        tail.next=head;
        curr=head;
        for(int i=1;i<len-k && curr!=null;i++){
            curr = curr.next;
        }
        head = curr.next;
        curr.next = null;

        return head;
    }
}
