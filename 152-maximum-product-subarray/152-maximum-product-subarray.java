class Solution {
    public int maxProduct(int[] nums) {
        
        int maxProd = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++) {
            int prod = 1;
            
            for(int j=i;j<nums.length;j++) {
                prod = prod * nums[j];
                maxProd = Math.max(maxProd, prod);
               
            }
            
        }
        if(maxProd == Integer.MIN_VALUE) {
            return 0;
        }
        return maxProd;
    }
}