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
        
        
        ListNode slow = findMid(head);
        ListNode fast = Reverse(slow.next);
        // slow.next = null;
        slow = head;
        
        while(fast != null) {
            if(fast.val == slow.val) {
                fast = fast.next;
                slow = slow.next;
            } else {
                return false;
            }
        }
        
        if(fast == null) {
            return true;
        }
        
        
        
        return false;
        
    }
    
    private ListNode findMid(ListNode head) {
        
        ListNode fast = head;
        ListNode slow = head;
        
        while(fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        
       return slow;
        
    }
    
    
    private ListNode Reverse(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        ListNode temp = null;
        while(curr != null) {
            temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        curr = head;
        
        return prev;
    }
}