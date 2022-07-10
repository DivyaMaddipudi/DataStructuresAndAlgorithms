class Solution {
    public int countKDifference(int[] nums, int k) {
        
        HashMap<Integer, Integer> hm = new HashMap<>();
        
        int count = 0;
        for(int i=0;i<nums.length;i++) {
            if(hm.containsKey(nums[i])) {
                int value = hm.get(nums[i]);
                value++;
                hm.put(nums[i], value);
            } else {
                hm.put(nums[i], 1);
            }
        }
        
        System.out.println(hm);
        for(Integer key: hm.keySet()) {
            int diff = key - k;
            System.out.println(key);
            if(hm.containsKey(diff)) {
                count += hm.get(diff) * hm.get(key);
            }
        }
        return count;
    }
}