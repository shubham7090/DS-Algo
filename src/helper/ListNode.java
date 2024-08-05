package helper;

public class ListNode {
    public int val;
    public ListNode next;
    public ListNode() {}
    public ListNode(int val) { this.val = val; }
    public ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    public static ListNode createFromArray(int[] arr){
        ListNode head = new ListNode();
        ListNode curr =head;
        for(int i:arr){
            ListNode next = new ListNode(i);
            curr.next = next;
            curr = curr.next;
        }
        return head.next;
    }

    public static void display(ListNode head){
         if(head==null){
             System.out.println("Null");
             return;
         }
        ListNode curr = head;
         while(curr!=null){
             System.out.print(curr.val + "->");
             curr=curr.next;
         }
        System.out.println();
    }
}