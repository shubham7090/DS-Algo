package Problems;

import helper.ListNode;

public class LeetCode203 {

    public static void run(){
        int[] arr = {1, 2, 3, 4, 5, 6};
        ListNode head = ListNode.createFromArray(arr);
        ListNode.display(removeElements(head,6));
    }

    public static  ListNode removeElements(ListNode head, int val) {
        ListNode curr = head;

        while(curr!=null&&curr.next!=null){
            if(curr.next.val==val){
                curr.next=curr.next.next;
            }else{
                curr = curr.next;
            }
        }
        if(head!=null&&head.val==val)return head.next;

        return head;
    }
}
