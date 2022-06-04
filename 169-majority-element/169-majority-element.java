class Solution {
    public int majorityElement(int[] nums) {
        
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        
        int majCount = 0;
        int majority = 0;

        for(int i=0;i<nums.length;i++) {
            if(hm.containsKey(nums[i])) {
                int count = hm.get(nums[i]);
                count++;
                hm.put(nums[i], count);
            } else {
                hm.put(nums[i], 1);
            }
        }
        
       for(Integer key: hm.keySet()) {
           System.out.println(key + " : " + hm.get(key));
           if(hm.get(key) > majCount) {
               majCount = hm.get(key);
               System.out.println(key + " key ");
               majority = key;

           }
           // if(value >= nums.length/2) {
           //     majCount = majCount + 1;
           // }
       }
        return majority;    
    }
}