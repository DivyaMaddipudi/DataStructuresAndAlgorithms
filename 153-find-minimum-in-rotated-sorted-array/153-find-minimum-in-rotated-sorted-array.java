class Solution {
    public int findMin(int[] nums) {
        if(nums.length == 0) return -1;
        
        int l = 0;
        int h = nums.length - 1;
        int min = nums[0];
        int mid = l + (h-l)/2;
        min = nums[mid];
        while(l<h) {
            int minVal = Math.min(nums[l], nums[h]);
            System.out.println(minVal);
            min = Math.min(min, minVal);  
            l++;
            h--;
        }
     return min;   
    }
}