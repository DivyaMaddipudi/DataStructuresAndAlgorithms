class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> (a[0] - b[0]));
        for(int i=0;i<nums.length;i++) {
            pq.add(new int[]{nums[i], i});
            if(pq.size()>k) {
                pq.poll();
            }
        }
        
        HashSet<Integer> hs = new HashSet<>();
        
        
        while(!pq.isEmpty()) {
            hs.add(pq.poll()[1]);            
        }        
 
        int[] output = new int[k];
        int index = 0;
        for(int i=0;i<nums.length;i++) {
            if(hs.contains(i)) {
                output[index] = nums[i];
                index++;
            }
        }
        return output;
    }
}