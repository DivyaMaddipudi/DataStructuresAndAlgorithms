class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int prod = 1;
        int start = 0;
        int count = 0;
        for(int end=0;end<nums.length;end++) {
            prod = 1;
            for(int i=end;i<nums.length;i++) {
                prod *= nums[i];
                if(prod < k) {
                 count++;   
                } else if(prod >= k) {
                    break;
                }
            }
        }
        return count;
    }
}