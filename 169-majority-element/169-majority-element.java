class Solution {
    public int majorityElement(int[] nums) {
        
        int count = 0;
        int majority = 0;
        
        for(int i=0;i<nums.length;i++) {
            if(count == 0) {
                majority = nums[i];
            }
            
            if(majority == nums[i]) {
                count++;
            } else if(majority != nums[i]) {
                count--;
            }
        }
        
//         HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
//         int majCount = 0;
//         int majority = 0;
//         for(int i=0;i<nums.length;i++) {
//             if(hm.containsKey(nums[i])) {
//                 int count = hm.get(nums[i]);
//                 count++;
//                 hm.put(nums[i], count);
//             } else {
//                 hm.put(nums[i], 1);
//             }
//         }
//        for(Integer key: hm.keySet()) {
//            System.out.println(key + " : " + hm.get(key));
//            if(hm.get(key) > majCount) {
//                majCount = hm.get(key);
//                majority = key;
//            }
//        }
        return majority;    
    }
}