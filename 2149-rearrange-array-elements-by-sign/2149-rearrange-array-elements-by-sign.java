class Solution {
    public int[] rearrangeArray(int[] nums) {
        
        
        int pCount = 0;
        int nCount = 0;
        for(int i=0;i<nums.length;i++) {
            if(nums[i] >= 0) {
                pCount++;
            } else {
                nCount++;
            }
        }
        
        int[] ans = new int[nums.length];
        
        int[] positive = new int[pCount];
        int[] negative = new int[nCount];
        
        int pValue = 0;
        int nValue = 0;
        for(int i=0;i< nums.length; i++) {
            if(nums[i] >= 0) {
                positive[pValue++] = nums[i];
            } else {
                negative[nValue++] = nums[i];
            }
        }
        
        System.out.println(Arrays.toString(positive));

        System.out.println(Arrays.toString(negative));
        
        int k=0;
        int j=0;
        for(int i=0;i<ans.length;i++) {
            if(i%2 == 0) {
                ans[i] =  positive[k];
                k++;
            } else {
                ans[i] =  negative[j];
                j++;
            }
        }
        
        return ans;
        
        
    }
}