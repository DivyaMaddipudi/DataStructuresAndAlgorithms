class Solution {
    public int findMiddleIndex(int[] nums) {
        
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        
        left[0] = nums[0];
        right[nums.length-1] = nums[nums.length-1];
        for(int i=1;i<nums.length;i++) {
            left[i] = left[i-1] + nums[i]; 
            right[nums.length-1- i] = right[nums.length - i] + nums[nums.length- 1 - i];
        }
        
        for(int j=0;j<nums.length;j++) {
            if(left[j] == right[j]) {
                return j;
            }
        }
        return -1;
        
    }
}