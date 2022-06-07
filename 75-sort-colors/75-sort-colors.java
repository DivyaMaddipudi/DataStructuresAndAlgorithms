class Solution {
    public void sortColors(int[] nums) {
        int max = 0;
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
            count [i] = count[i-1] + count[i];
        }
        
        
        int[] sortedArr = new int[count[count.length-1]];
        
        for(int i=nums.length-1;i>=0;i--) {
            sortedArr[count[nums[i]]-1] = nums[i];
            --count[nums[i]];
        }
      
         for(int i=0;i<sortedArr.length;i++) {
           nums[i] = sortedArr[i];
        }
    }
}