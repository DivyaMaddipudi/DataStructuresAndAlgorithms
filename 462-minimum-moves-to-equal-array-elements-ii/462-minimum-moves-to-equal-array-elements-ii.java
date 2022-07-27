class Solution {
    public int minMoves2(int[] nums) {
        long min = Long.MAX_VALUE;
        
        // OPTIMIZED
        int ptr = 0;
        int i = 0;
        long steps = 0;
        
        while(ptr < nums.length) {
            long value = nums[ptr];
            // System.out.println(ptr + " " + i + " steps " + steps);
            if(nums[i] <= value) {
               steps += value - nums[i];
           } else if(nums[i] > value) {
                steps += nums[i] - value;
            }
            i++;
            
            if(i == nums.length) {
                min = Math.min(min, steps);
                ptr++;
                i=0;
                steps = 0;
            }
          
        }
        return (int)min;
        
        
        // BRUTE FORCE
        // O(N**2)
        
        // for(int j=0;j<nums.length;j++) {
        //     long value = nums[j];
        //     long steps = 0;
        //     for(int i=0;i<nums.length;i++) {
        //         if(nums[i] <= value) {
        //            steps += value - nums[i];
        //        } else if(nums[i] > value) {
        //             steps += nums[i] - value;
        //         }
        //     }
        //     min = Math.min(min, steps);
        // }
        // return (int)min;
    }
}