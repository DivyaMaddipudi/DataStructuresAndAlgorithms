class FindSumPairs {
    
    int[] nums1, nums2;
    HashMap<Integer, Integer> hm = new HashMap<>();

    public FindSumPairs(int[] nums1, int[] nums2) {
        this.nums1 = nums1;
        this.nums2 = nums2;
        
         for(int i=0;i<nums2.length;i++) {
           hm.put(nums2[i], hm.getOrDefault(nums2[i], 0 )+ 1);
        } 
    }
    
    public void add(int index, int val) {
        hm.put(nums2[index], hm.getOrDefault(nums2[index], 0 )- 1);
        nums2[index] += val;
        hm.put(nums2[index], hm.getOrDefault(nums2[index], 0 )+ 1);
        
    }
    
    public int count(int tot) {
        int count = 0;
        for(int i=0;i<nums1.length;i++) {
            int diff = 0;
            if(nums1[i] <= tot) {
                diff = tot - nums1[i];
                if(hm.containsKey(diff)) {
                    count += hm.get(diff);
                }
            } 
        }
      
      return count;
    }
}

/**
 * Your FindSumPairs object will be instantiated and called as such:
 * FindSumPairs obj = new FindSumPairs(nums1, nums2);
 * obj.add(index,val);
 * int param_2 = obj.count(tot);
 */