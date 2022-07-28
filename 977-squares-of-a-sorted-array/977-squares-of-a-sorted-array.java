class Solution {
    public int[] sortedSquares(int[] nums) {
       
        int[] output = new int[nums.length];
       
        int outputPtr = nums.length - 1;
        int low = 0;
        int high = nums.length - 1;
        while(low <= high) {
            if(Math.abs(nums[low]) < Math.abs(nums[high])) {
                output[outputPtr] = (int) Math.pow(nums[high],2);
                high--;
            } else {
                output[outputPtr] = (int) Math.pow(nums[low],2);
                low++;
            }
            outputPtr--;
        }
            
        return output;
    }
}