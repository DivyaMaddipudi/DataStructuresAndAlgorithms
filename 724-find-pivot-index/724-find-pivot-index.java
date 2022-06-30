class Solution {
    public int pivotIndex(int[] nums) {
        int leftSum = 0;
        int rightSum = 0;
        
        for(int i=0;i<nums.length;i++) {
            leftSum = sum(nums, 0,i);
            rightSum = sum(nums, i+1, nums.length);
            if(leftSum == rightSum) {
               return i;
            } 
        }
        return -1;
     }
    
    private int sum(int[] arr, int start, int end) {
        
        int sum = 0;
        for(int i=start;i<end;i++) {
            sum += arr[i];
        }
        return sum;
    }
}