package Problems;

import helper.ListNode;

public class LeetCode237 {

    public static void run(){
        int[] arr = {1,2,3,4,5,6};
        ListNode head = ListNode.createFromArray(arr);
        deleteNode(head.next);
        ListNode.display(head);
    }

    public static void deleteNode(ListNode node) {
        ListNode prev = node;
        while(node.next!=null){
            node.val = node.next.val;
            prev = node;
            node = node.next;
        }
        prev.next=null;
    }
}
