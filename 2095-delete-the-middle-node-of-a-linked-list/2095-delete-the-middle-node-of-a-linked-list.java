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
       
//         ListNode curr = head;
//         ListNode slow = head;
//         ListNode fast = head;
//         ListNode dummy = head;
//         int count = 0;
//         int countTwo = 0;
        
//         if (curr != null && curr.next == null){
//             return curr;
//         }
        
//         while(fast != null && fast.next != null){
//             dummy=slow;
//             slow = slow.next;
//             fast = fast.next.next;
//         }
        
        
//         return dummy;
//          if (dummy.next.val==slow.val){
//                  dummy.next = dummy.next.next;
//              }
//          while (dummy!=null && dummy.next!=null){
//              dummy=dummy.next;
//          }
        
        if (head == null){
            return null;
        }
        if (head.next == null){
            return null;
        }
        
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;
        
        while (fast != null && fast.next !=null){
            fast = fast.next.next;
            prev = slow;
            slow = slow.next;
        }
        
        prev.next = slow.next;
            return head;
            
}
}