class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        
        int[] output = new int[nums.length];
        int max = nums[0];
        for(int i=0;i<nums.length;i++) {
            if(nums[i] > max) {
                max = nums[i];
            }
        }
        
       int[] count = new int[max+1];
        for(int i=0;i<nums.length;i++) {
            count[nums[i]]++;
        }
        
        for(int i=1;i<count.length;i++) {
            count[i] += count[i-1];            
        }
        
        for(int i=0;i<nums.length;i++) {
          if(nums[i] != 0) {
               output[i] = count[nums[i]-1];
          } else {
              output[i] = 0;
          }
        }
        return output;
    }
}