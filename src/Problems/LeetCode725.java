package Problems;

import helper.ListNode;

public class LeetCode725 {
    public static void run(){

    }

    public static ListNode[] splitListToParts(ListNode head, int k) {
        int n = size(head);
        int div = n/k;
        int rem = n%k;
        ListNode[] ans = new ListNode[k];
        for(int i=0;i<k;i++){
            int val = div + (rem>0?1:0) - 1;
            rem--;
            ListNode curr=head;
            while(curr!=null && val>0){
                curr=curr.next;
                val--;
            }
            ans[i] = head;
            if(curr!=null){
                head = curr.next;
                curr.next=null;
            }
        }
        return ans;
    }

    public static int size(ListNode head){
        int count = 0;
        while(head!=null){
            count++;
            head=head.next;
        }
        return count;
    }
}
