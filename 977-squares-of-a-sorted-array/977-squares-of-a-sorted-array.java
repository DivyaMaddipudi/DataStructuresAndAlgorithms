class Solution {
    public int[] sortedSquares(int[] nums) {
       
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> a - b);
        for(int i=0;i<nums.length;i++) {
            nums[i] = (int) Math.pow(nums[i], 2);
        }
        for(int i=0;i<nums.length;i++) {
            pq.add(nums[i]);   
        }
        
        for(int i=0;i<nums.length;i++) {
            nums[i] = pq.poll();
        }
        
        // int[] output = new int[nums.length];
        // int outputPtr = nums.length - 1;
        // int low = 0;
        // int high = nums.length - 1;
        // while(low <= high) {
        //     if(Math.abs(nums[low]) < Math.abs(nums[high])) {
        //         output[outputPtr] = (int) Math.pow(nums[high],2);
        //         high--;
        //     } else {
        //         output[outputPtr] = (int) Math.pow(nums[low],2);
        //         low++;
        //     }
        //     outputPtr--;
        // }
            
        return nums;
    }
}