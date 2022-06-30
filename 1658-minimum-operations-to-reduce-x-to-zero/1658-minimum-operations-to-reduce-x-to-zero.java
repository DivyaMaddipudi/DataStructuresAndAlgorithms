class Solution {
    public int minOperations(int[] nums, int x) {
        
        int totalSum = 0;
        
        for(int i=0;i<nums.length;i++) {
            totalSum += nums[i];
        }
        
        int target = totalSum - x;
        
        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(0,-1);
        int sum =0;
        int maxVal = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++) {
            sum += nums[i];
            int diff = sum - target;
            System.out.println(diff);
            if(hm.containsKey(diff)) {
                maxVal = Math.max(maxVal, i-hm.get(diff));
                if(!hm.containsKey(sum)) {
                    hm.put(sum, i);
                }
            } else {
                 hm.put(sum, i);
            }
        }
        if(nums.length - maxVal > 0) {
            return nums.length - maxVal;
        } else if(hm.containsKey(x)){
            return nums.length;
        } else {
            return -1;
        }
    }
}