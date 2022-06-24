class Solution {
    public boolean search(int[] nums, int target) {
        if(nums.length == 0) return false;
        
        int l = 0;
        int h = nums.length - 1;
        
        while(l <= h) {
            int mid = l + (h-l)/2;
            if(nums[mid] == target) {
                return true;
            } else if(nums[l] < nums[mid]) {
                if(target >= nums[l] && target <= nums[mid-1]) {
                    h = mid - 1;
                } else {
                    l = mid + 1;
                }
            } else if(nums[l] > nums[mid]){
                  if(target > nums[mid] && target <= nums[h]) {
                    l = mid + 1;
                } else {
                    h = mid - 1;
                }
            } else {
                l++;
            }
        }
        return false;
        
    }
}