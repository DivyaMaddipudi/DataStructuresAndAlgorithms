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
    public ListNode reverseKGroup(ListNode head, int k) {
        
        int size = 0;
        ListNode temp = head;
        while(temp != null) {
            temp = temp.next;
            size++;
        }
        
        if(size%k != 0) {
            size = size - (size%k);
        } 
        
        int[] arr = new int[size];
        
        int count = 0;
        ListNode arrNode = head;
        while(arrNode != null && count < size) {
            arr[count] = arrNode.val;
            arrNode = arrNode.next;
            count++;
        }
        
        
        for(int i=0;i<arr.length;i=i+k) {
            arrayReverse(arr, i,i+k);
        }
        
        
        ListNode newList = head;
        for(int i=0;i<arr.length;i++) {
            newList.val = arr[i];
            newList = newList.next;
        }
        
        System.out.println(Arrays.toString(arr));
        
        return head;
        
    }
    
    private int[] arrayReverse(int[] arr, int low, int hig) {
        int high = hig - 1;
        while(low <= high) {
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
        return arr;
    }
}
