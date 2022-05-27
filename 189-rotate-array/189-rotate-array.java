class Solution {
    public void rotate(int[] nums, int k) {
        int[] copy = new int[nums.length];
        for(int i=0;i<nums.length;i++) {
            copy[(i+k)%nums.length] = nums[i];
        }
      
        for(int i=0;i<copy.length;i++) {
            nums[i] = copy[i];
        }
        
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
}