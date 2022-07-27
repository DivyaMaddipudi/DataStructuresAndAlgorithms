class Solution {
    public int removeDuplicates(int[] nums) {
       
        int f = 2;
        int s = 2;
        for(int i=2;i<nums.length;i++) {
            if(nums[s-2] != nums[f]) {
                nums[s] = nums[f];
                s++;
                f++;
            } else {
                f++;
            } 
            
        }
        return s;
    }
}