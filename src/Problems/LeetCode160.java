package Problems;

import helper.ListNode;

public class LeetCode160 {

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode ptrA = headA;
        ListNode ptrB = headB;

        while(ptrA!=ptrB){
            ptrA = ptrA==null?headB:ptrA.next;
            ptrB = ptrB==null?headA:ptrB.next;
        }

        return ptrA;
    }
}
