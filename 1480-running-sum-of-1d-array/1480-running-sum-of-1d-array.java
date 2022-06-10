class Solution {
    public int[] runningSum(int[] nums) {
        
        int slow = 0;
        for(int fast =1;fast<nums.length;fast++) {
            nums[fast] = nums[slow] + nums[fast];
            slow++;
        }
        return nums;
    }
}