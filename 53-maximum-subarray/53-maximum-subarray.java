class Solution {
    public int maxSubArray(int[] nums) {
        if(nums == null || nums.length == 0) return -1;
        
        int rSum = 0;
    
        int sum = Integer.MIN_VALUE;
        
        for(int i=0;i<nums.length;i++) {
            rSum += nums[i];
            sum = Math.max(sum, rSum);
            
            if(rSum < 0) {
                rSum = 0;
            }
            
        }
        return sum;
    }
}