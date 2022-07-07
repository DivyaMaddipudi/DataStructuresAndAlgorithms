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
    public ListNode removeElements(ListNode head, int val) {
        
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        head = dummy;
        removeElement(head, val);
        return head.next;
    }
    
    public void removeElement(ListNode head, int val) {
        if( head.next == null) {
            return;
        }
        
        removeElement(head.next, val);
        
        if(head.next.val == val) {
            
            if(head.next.next != null) {
                head.next = head.next.next;
            } else {
                head.next = null;
            }
        }
        
    }
}