/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteMiddle(ListNode head) {
       
        ListNode curr = head;
        ListNode slow = head;
        ListNode fast = head;
        ListNode dummy = null;

        if (curr != null && curr.next == null){
            return null;
        }
        
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            dummy=slow;
            slow = slow.next;
        }
        
        dummy.next = slow.next;
        return head;

        

}
}