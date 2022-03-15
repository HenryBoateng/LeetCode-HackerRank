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
// class Solution {
//     public ListNode deleteDuplicates(ListNode head) {
//     HashSet<Integer> set = new HashSet<Integer>();
//         ListNode curr = head;
//         ListNode prev = null;
//         while (curr != null && curr.next != null){
//             if (set.contains(curr.val)){
//                 prev.next = curr.next;
//             } else{
//                 set.add(curr.val);
//                 prev = curr;
//             }
//             curr = curr.next;
//         }
//        return prev; 
//     }
// }
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        // Corner case
        if(head == null || head.next == null) return head;
        
        // Compare current node with next node
        // If the same, skip next node
        ListNode curr = head;
        while(curr.next != null) {
            if(curr.val == curr.next.val) {
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
            }
        }
        
        return head;
    }
}