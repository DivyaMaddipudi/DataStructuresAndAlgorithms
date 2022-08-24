class Solution {
    public void rotate(int[] nums, int k) {
        
        int n = nums.length;
        k = k % n;
        
        reverse(nums, n-k, n-1);
        reverse(nums, 0, n-k-1);
        reverse(nums, 0, n-1);
        //BRUTE FORCE
        // while(k>0) {
        // int temp = nums[nums.length-1];
        //     for(int i=nums.length-1;i>0;i--) {
        //         nums[i] = nums[i-1];
        //     }
        // nums[0] = temp;
        // k--;
        // }
    }
    
    private void reverse(int[] nums, int left, int right) {
        
        while(left <= right) {
            swap(nums, left, right);
            left++;
            right--;
        }
    }
    
    private void swap(int[] nums, int left, int right) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }
}