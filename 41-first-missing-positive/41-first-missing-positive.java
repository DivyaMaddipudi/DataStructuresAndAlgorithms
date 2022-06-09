class Solution {
    public int firstMissingPositive(int[] nums) {
        
        if(nums.length == 1 && nums[0]!=1) return 1;
        
        if(nums.length == 1 && nums[0]==1) return 2;
       
        int min=Integer.MAX_VALUE;
        
        HashMap<Integer, Integer> hm = new HashMap<>();
        
        Arrays.sort(nums);
        
        int startIndex = 0;
         for(int i=0;i<nums.length;i++) {
            hm.put(nums[i],0);
            if(min > nums[i] && nums[i] > 0) {
                min = nums[i];
            }
        }
    
        
        int max = nums.length;

        
        int i=1;
        int missedValue = 1;
       
        if(min!=1) {
            return 1;
        } else {
        while(i<=max+1) {
            System.out.println(" IN WHILE ");
            if(hm.containsKey(i)) {
                i++;
            } else {
                return i;
            }
         }
        }
        return missedValue;
    }
}