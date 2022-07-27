class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        
        if(nums == null || nums.length == 0) return 0;
        
        return helper(nums, target, 0, 0);
        
        
        
    }
    
    public int helper(int[] nums, int target, int index, int sum) {
        
        //base case
        
        if(index == nums.length) {
            // System.out.println( " " + sum + " " + index);
            if(sum == target) {
                return 1;
            } else {
                return 0;
            }
        }
        
        //logic 
        int val = 0;
        int val2 = 0;
        // for(int i=index;i<nums.length;i++) {
            int curr = nums[index];
            
            // + 
            val += helper(nums, target, index+1, sum + nums[index]);
            
            // -
            val2 += helper(nums, target, index+1, sum - nums[index]);
        // }
        return val + val2;
        
    }
}