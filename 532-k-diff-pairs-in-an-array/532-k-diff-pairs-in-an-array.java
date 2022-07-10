class Solution {
    public int findPairs(int[] nums, int k) {
        
        HashMap<Integer, Integer> hm = new  HashMap<Integer, Integer>();
        
        for(int i=0;i<nums.length;i++) {
            if(hm.containsKey(nums[i])) {
                int count = hm.get(nums[i]);
                count++;
                hm.put(nums[i], count);
            } else {
                hm.put(nums[i], 1);
            }
        }
        
        int count = 0;
       for(Integer key : hm.keySet()) {
         if(key + k == key) {
             if(hm.get(key) > 1) {
                 count++;
             }
         } else {
            if(hm.containsKey(key + k)) {
              count++;
            }
         }
       }
        
     return count;
    }
}