class Solution {
    public int minSubArrayLen(int target, int[] nums) {
       int curr_sum = 0;
        int window_length = Integer.MAX_VALUE;
        
        int i = 0;
        int j=0;
        while(i<nums.length && j<nums.length) {
            curr_sum += nums[i];
            while(curr_sum >= target) {
                window_length = Math.min(window_length, i-j+1);
                curr_sum -= nums[j];
                j=j+1;
            } 
            i++;
            
        }
        return window_length == Integer.MAX_VALUE?0:window_length;
    }
}