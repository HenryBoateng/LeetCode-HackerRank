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
    
    public boolean isPalindrome(ListNode head) {
        
        ListNode fast = head;
        ListNode slow = head;
        
        while(fast != null && fast.next != null){ //1->2->3->3->2->1
           fast = fast.next.next;
            slow = slow.next;
        }
        
        slow = reverse(slow);
        fast = head;
        
        while (slow != null){
            if (slow.val != fast.val){
                return false;
            }
            slow = slow.next;
            fast = fast.next;
        }
        return true;
        
            }
    
    public static ListNode reverse(ListNode slow){
        if (slow == null) {
            return null;
        }
        else if (slow.next == null){
            return slow;
        }
        
        ListNode headReverse = reverse(slow.next);
        slow.next.next = slow;
        slow.next = null;
        return headReverse;
    }
    
        } 