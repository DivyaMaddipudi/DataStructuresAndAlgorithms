class Solution {
    public int maxSubArray(int[] nums) {
        
        int sum = 0;
        int maxSoFar = nums[0];
        
        for(int i=0;i<nums.length;i++) {
            sum += nums[i];
            maxSoFar = Math.max(maxSoFar, sum);
            
            if(sum < 0) {
                sum = 0;
            }
        }
        
        return maxSoFar;
    }
}