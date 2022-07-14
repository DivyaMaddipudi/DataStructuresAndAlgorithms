class Solution {
    public int maxProduct(int[] nums) {
        
        
        int l = 1;
        int r = 1;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++) {
            
            l = l == 0 ? 1 : l;
            r = r == 0 ? 1 : r;
            
            l *= nums[i];
            r *= nums[nums.length-i-1];
            
            max = Math.max(max, Math.max(l, r));
        }
        
        return max;
        
//         int maxProd = Integer.MIN_VALUE;
//         for(int i=0;i<nums.length;i++) {
//             int prod = 1;
            
//             for(int j=i;j<nums.length;j++) {
//                 prod = prod * nums[j];
//                 maxProd = Math.max(maxProd, prod);
               
//             }
            
//         }
//         if(maxProd == Integer.MIN_VALUE) {
//             return 0;
//         }
//         return maxProd;
    }
}