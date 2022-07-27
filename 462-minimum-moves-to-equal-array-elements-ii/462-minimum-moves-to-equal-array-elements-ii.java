class Solution {
    public int minMoves2(int[] nums) {
        
        long min = Long.MAX_VALUE;
        System.out.println(min);
        for(int j=0;j<nums.length;j++) {
            long value = nums[j];
            long steps = 0;
            for(int i=0;i<nums.length;i++) {
                if(nums[i] <= value) {
                   steps += value - nums[i];
               } else if(nums[i] > value) {
                    steps += nums[i] - value;
                }
            }
            min = Math.min(min, steps);
        }
        return (int)min;
    }
}