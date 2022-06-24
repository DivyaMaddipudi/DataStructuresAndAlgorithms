class Solution {
    public int findMin(int[] nums) {
        if(nums.length == 0) return -1;
        
        int low = 0;
        int high = nums.length - 1;
        
        int min = Integer.MAX_VALUE;
        while( low <= high) {
            int mid = low + (high - low)/2;
            min = Math.min(min, nums[mid]);
            
            if(nums[low] < nums[mid] && nums[low] < nums[high]) {
                if(min >= nums[low] && min <= nums[mid]) {
                    high = mid -1;
                }  else {
                    low = mid + 1;
                }
            } else if(nums[high] > nums[mid]){
                if(min >= nums[high] && min <= nums[mid]) {
                    low = mid + 1;
                }  else {
                    high = mid -1;
                }
            } else {
                low++;
            }
        }
        return min;        
    }
}