class Solution {
    public int removeDuplicates(int[] nums) {
        
        int count = 0;
        int slow = 0;
        for(int fast =1;fast<nums.length;fast++) {
            if(nums[slow] != nums[fast]) {
                slow++;
                nums[slow] = nums[fast];
            } 
        }
        return slow+1;
    }
}