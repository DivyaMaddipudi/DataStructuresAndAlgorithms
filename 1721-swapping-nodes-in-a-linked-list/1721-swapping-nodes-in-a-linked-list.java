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
    public ListNode swapNodes(ListNode head, int k) {
        
        ListNode temp = head;
        int size =0;
        while(temp!=null) {
            size++;
            temp = temp.next;
        }
        
        int lastIndex = size - k + 1;
        ListNode first = head;
        ListNode second = head;
        
        while(k>1) {
            k--;
            first = first.next;
            
        }
        
        
        while(lastIndex>1) {
            lastIndex--;
            second = second.next;
            
        }
        
        System.out.println(second.val +" " + first.val );
        int value = first.val;
        first.val = second.val;
        second.val = value;
        
        return head;
    }
}