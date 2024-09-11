package Problems;

import helper.ListNode;

public class LeetCode2807 {

    public static void run(){
        ListNode.display(insertGreatestCommonDivisors(ListNode.createFromArray(new int[]{18,6,10,3})));
    }

    public static ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head==null)return head;
        ListNode curr = head;
        while(curr.next!=null){
            int gcd = findGcd(curr.val,curr.next.val);
            ListNode temp = curr.next;
            curr.next = new ListNode(gcd,temp);
            curr = temp;
        }
        return head;
    }

    public static int findGcd(int a,int b){
        if(b==0)return a;
        return findGcd(b,a%b);
    }
}
