class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        
        for(int i=0;i<nums.length;i++) {
            
            if(i > 0 && nums[i] == nums[i-1]) continue;
            
            int low = i+1;
            int high = nums.length - 1;
            
            
            while(low < high) {
                int sum = nums[i] + nums[low] + nums[high];
                if(sum > 0) {
                    high--;
                } else if(sum < 0) {
                    low++;
                } else {
                    ArrayList<Integer> al = new ArrayList<>();
                    al.add(nums[low]);
                    al.add(nums[high]);
                    al.add(nums[i]);
                    System.out.println(al);
                    low++;
                    high--;
                    result.add(al);
                    while(low < high && nums[low] == nums[low-1]) {
                        low++;
                    }
                    
                    while(low < high && nums[high] == nums[high+1]) {
                        high--;
                    }
                }
            }            
        }
        return result;
        
        // BRUTE FORCE 
        
        // List<List<Integer>> result = new ArrayList<>();
        // HashSet<List<Integer>> hs = new HashSet<>();
        // for(int i=0;i<nums.length;i++) {
        //     for(int j=i+1;j<nums.length;j++) {
        //         for(int k=j+1;k<nums.length;k++) {
        //             if(nums[i] + nums[j] + nums[k] == 0) {
        //                 ArrayList<Integer> al = new ArrayList<Integer>();
        //                 al.add(nums[i]);
        //                 al.add(nums[j]);
        //                 al.add(nums[k]);
        //                 Collections.sort(al);
        //                 if(!hs.contains(al)) {
        //                     hs.add(al);
        //                     result.add(al);
        //                 }
        //             }
        //         }
        //     }
        // }
        // return result;
    }
}