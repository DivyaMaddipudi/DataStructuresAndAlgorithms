class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int slow = 0;
        if(n!=0) {
            if(m!=0) {
                for(int fast=0;fast<nums1.length && slow<n;fast++) {
                    if(nums2[slow] < nums1[fast]) {
                        shiftRight(nums1, fast);
                        nums1[fast] = nums2[slow];
                        slow++;
                    }
                }
            } else {
                for(int i=0;i<n;i++) {
                    nums1[i] = nums2[i];
                }
            }
        }
       
        if(slow < n) {
            for(int i=slow;i<n;i++) {
                nums1[m+i] = nums2[i];
            }
        }
    }
    
    public void shiftRight(int[] nums, int val) {
        
        for(int i=nums.length-1;i>val;i--) {
             nums[i] = nums[i-1];
            // System.out.println(nums[i]);
        }
        
    }
}