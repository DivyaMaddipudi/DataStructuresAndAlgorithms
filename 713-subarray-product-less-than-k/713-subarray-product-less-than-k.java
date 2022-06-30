class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        //Sliding window technique
        
        if(k<= 0) return 0;
        int s = 0;
        int prod = 1;
        int res = 0;
        for(int i=0;i<nums.length;i++) {
            prod *= nums[i];
            while(prod>=k && s<=i) {
                prod = prod/nums[s];
                s++;
            }
            res += i - s + 1;
            System.out.println(res);
            
        }
        return res;
        //BRUTE FORCE
        
        // int prod = 1;
        // int start = 0;
        // int count = 0;
        // for(int end=0;end<nums.length;end++) {
        //     prod = 1;
        //     for(int i=end;i<nums.length;i++) {
        //         prod *= nums[i];
        //         if(prod < k) {
        //          count++;   
        //         } else if(prod >= k) {
        //             break;
        //         }
        //     }
        // }
        // return count;
    }
}