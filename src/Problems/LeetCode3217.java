package Problems;

import helper.ListNode;
import java.util.*;

public class LeetCode3217 {

    public static void run(){

    }

    public static ListNode modifiedList(int[] nums, ListNode head) {
        Set<Integer> st = new HashSet<>();
        for(int num:nums)st.add(num);

        ListNode curr = head;
        while(curr.next!=null){
            if(st.contains(curr.next.val)){
                curr.next = curr.next.next;
            }else{
                curr = curr.next;
            }
        }
        if(st.contains(head.val))return head.next;
        return head;
    }

}
