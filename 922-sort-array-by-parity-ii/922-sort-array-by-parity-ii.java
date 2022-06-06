class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int l = 0;
        int r =1;
        
        while(l<nums.length && r<nums.length) {
            if(l%2 == 0 && nums[l]%2 == 0) {
                l = l + 2;
            } else {
                
                if(r%2 != 0 && nums[r]%2 != 0) {
                    r = r+2;
                } else {
                    int temp = nums[l];
                    nums[l] = nums[r];
                    nums[r] = temp;
                }
                
            }
        }     
        return nums;
    }
    
    public void swap(int num1, int num2) {
        System.out.println(num1 + " " + num2);
        
        int temp = num1;
         num1 = num2;
         num2 = temp;
        System.out.println(num1 + " " + num2);
    }
}