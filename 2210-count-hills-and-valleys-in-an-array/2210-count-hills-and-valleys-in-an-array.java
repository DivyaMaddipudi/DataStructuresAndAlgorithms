class Solution {
    public int countHillValley(int[] nums) {
        if(nums.length < 3) return 0;
        
        int count = 0;
        
        int prev = nums[0];
        for(int i=1;i<nums.length-1;i++) {
            if((nums[i]>nums[i+1] && nums[i] > prev) || (nums[i]<nums[i+1] && nums[i]<prev)) {
                count++;
            } 
             if(nums[i] != nums[i+1]) {
                prev = nums[i];
            }
        }
        
        return count;
        
    }
}