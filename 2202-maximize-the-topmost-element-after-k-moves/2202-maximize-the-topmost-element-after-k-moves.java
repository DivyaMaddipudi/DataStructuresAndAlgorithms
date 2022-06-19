class Solution {
    public int maximumTop(int[] nums, int k) {
        int n = nums.length;
        
        if(n==1) {
            if(k%2 == 0) {
                return nums[0];
            } else {
                return -1;
            }
        }
        int max = 0;
        if(k > nums.length) {
            for(int i=0;i<nums.length;i++) {
                if(nums[i] > max) {
                    max = nums[i];
                }
            }
            return max;
        } else if(k<nums.length) {
            for(int i=0;i<k-1;i++) {
                 if(nums[i] > max) {
                    max = nums[i];
                }
            }
            max = Math.max(nums[k], max);
            return max;
        } else {
            for(int i=0;i<k-1;i++) {
                 if(nums[i] > max) {
                    max = nums[i];
                }
            }
            return max;
        }
    }
}