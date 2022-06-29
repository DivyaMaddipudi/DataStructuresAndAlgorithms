class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        
        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(0, -1);
        int sum = 0;
        int maxValues = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++) {
            sum = sum + nums[i];
            if(hm.containsKey(sum%k)){
                maxValues = Math.max(maxValues, i- hm.get(sum%k));
            } else {
                hm.put(sum%k, i);
            }
        }
        
        return maxValues >= 2;
    }
}