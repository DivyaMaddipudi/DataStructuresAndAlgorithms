class Solution {
    public int findKthLargest(int[] nums, int k) {
       PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b- a);
        for(int i=0;i<nums.length;i++) {
            pq.add(nums[i]);
        }
        
        int min = Integer.MAX_VALUE;
        int i=0;
        while(i!=k){
            // if(min == pq.peek()) {
            //     pq.poll();
            // } else {
            min = Math.min(min,  pq.poll());
            i++;
            // }
        }
        return min;
    }
}