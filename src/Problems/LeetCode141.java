package Problems;

import helper.ListNode;

public class LeetCode141 {
    public static void run(){

    }

    public static ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        int length = 0;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                do{
                    slow=slow.next;
                    length++;
                }while(slow!=fast);
                break;
            }
        }

        if(length==0)return null;
        //find start
        ListNode first = head;
        ListNode second = head;

        while(length>0){
            second = second.next;
            length --;
        }

        while(first!=second){
            first = first.next;
            second=second.next;
        }

        return first;
    }
}
