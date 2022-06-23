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
    public int pairSum(ListNode head) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        ListNode temp = head;
        
        int len = 0;
        while(temp!=null) {
            temp = temp.next;
            len++;
        }
        System.out.println(len);
        
        int size = 0;
        temp = head;
        while(temp!=null) {
            if(hm.containsKey(size)) {
                int value = hm.get(size);
                value = value + temp.val;
                hm.put(size, value);
                
            } else {
                hm.put(len-1-size, temp.val);
            }
            System.out.println(temp.val + " val ");
            temp = temp.next;
            size++;
        }
        System.out.println(hm);
        int max = Integer.MIN_VALUE;
        for(Integer value: hm.values()) {
            if(value > max) {
                max = value;
            }
        }
        return max;
    }
}