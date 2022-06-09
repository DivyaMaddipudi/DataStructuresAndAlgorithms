class Solution {
    public int firstMissingPositive(int[] nums) {
        
        if(nums.length==1 && nums[nums.length-1] !=1) return 1;
        if(nums.length==1 && nums[nums.length-1] ==1) return 2;
        
        int num = nums.length;
        int missedValue = 0;
        boolean containsOne = false;
        for(int i=0;i<nums.length;i++) {
            if(nums[i] == 1) {
                containsOne = true;
            }
            if(nums[i] <= 0 || nums[i] > num) {
                nums[i] = 1;
            }
        }
        
        
        if(containsOne == false ) {
                    return 1;
        } 
        
        
        
        for(int i=0;i<nums.length;i++) {
            int index = Math.abs(nums[i])-1;
            System.out.println(index);
            if(nums[index] > 0) {
                nums[index] = -1 * nums[index];  
            }
        }
        
        for(int i=0;i<nums.length;i++) {
            System.out.println(nums[i]);
            if(nums[i] > 0) {
                System.out.println(nums[i] + " pos in array ");
                    return i+1;
            }
        }
        
        
        
        
        
        return num+1;
        
        
        
           // Tc: O(n) Sc: O(n)
//         if(nums.length == 1 && nums[0]!=1) return 1;
        
//         if(nums.length == 1 && nums[0]==1) return 2;
       
//         int min=Integer.MAX_VALUE;
        
//         HashMap<Integer, Integer> hm = new HashMap<>();
        
//         Arrays.sort(nums);
        
//         int startIndex = 0;
//          for(int i=0;i<nums.length;i++) {
//             hm.put(nums[i],0);
//             if(min > nums[i] && nums[i] > 0) {
//                 min = nums[i];
//             }
//         }
    
        
//         int max = nums.length;

        
//         int i=1;
//         int missedValue = 1;
       
//         if(min!=1) {
//             return 1;
//         } else {
//         while(i<=max+1) {
//             System.out.println(" IN WHILE ");
//             if(hm.containsKey(i)) {
//                 i++;
//             } else {
//                 return i;
//             }
//          }
//         }
//         return missedValue;
    }
}