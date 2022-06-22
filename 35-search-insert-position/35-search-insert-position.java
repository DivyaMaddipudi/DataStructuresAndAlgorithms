class Solution {
    public int searchInsert(int[] nums, int target) {
        
         if(nums[nums.length - 1] < target) {
            return nums.length;
        } else if(nums[0] > target){
            return 0;
        }
        
        int l = 0;
        int r = nums.length-1;
        int index = 0;
        int mid = 0;
        while(l<=r) {
             mid = (l+r)/2;
            System.out.println(mid + " mid");
            
            if(nums[mid] == target) {
                return mid;
            } else if(nums[mid] > target) {
                r = mid - 1;
                index = r;
            } else {
                l = mid + 1;
                index = l;
            }
        }
        
     
        return l;
    }
}