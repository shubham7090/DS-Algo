package Problems;

import helper.ListNode;

public class LeetCode445 {

    public static void run(){
        int[] arr1 = {7,2,4,3};
        ListNode head1= ListNode.createFromArray(arr1);
        int[] arr2 = {5,6,4};
        ListNode head2= ListNode.createFromArray(arr2);
        ListNode added = addTwoNumbers(head1,head2);
        ListNode.display(added);
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        l1 = LeetCode206.reverseList(l1);
        l2 = LeetCode206.reverseList(l2);

        ListNode ans = LeetCode2.addTwoNumbers(l1,l2);

        return LeetCode206.reverseList(ans);
    }


}
