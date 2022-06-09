class Solution {
    public int search(int[] nums, int target) {
        
        int min = nums[0];
        int min_index = 0;
        int[] copy = new int[nums.length];
        for (int i=0;i<nums.length;i++) {
            if(nums[i] < min) {
                min = nums[i];
                min_index = i;
                
            }
        }
        
        int initial = min_index;
        
        
       if(min_index != 0) {
            System.out.println("in if" + min_index);
        if(nums.length%2 != 0 ) {
            min_index = nums.length - min_index;

            for(int i=0;i<nums.length;i++) {
            copy[(i+min_index)%nums.length] = nums[i];
            System.out.println(initial + " in odd ekse " + min_index);
                
            // System.out.println(copy[i] +" " + i);
            }
        } else {
            min_index = nums.length - min_index;
            
            for(int i=0;i<nums.length;i++) {
            copy[(i+min_index)%nums.length] = nums[i];
            System.out.println(initial + " in even ekse " + min_index);
            }
        }
       
       } else {
            System.out.println("in else");
           
            for(int i=0;i<nums.length;i++) {
            copy[i] = nums[i];
            // System.out.println(copy[i] +" " + i);
            }
       }
        
        for(int i=0;i<nums.length;i++) {
            System.out.println(copy[i] +" " + i);
        }
        
        int low = 0;
        int high = copy.length -1;
        
        int value = searchMid(copy, low, high, target, initial);
       return value;
    }
    
    public int searchMid(int[] num, int low, int high, int target, int minI) {

        int mid = (low + high)/2;
        
        if(low <= high) {
        if(num[mid] == target) {
            System.out.println( minI + " " + mid + " mid and minI" + minI);
           if(minI+mid >= num.length) {
               return (minI+mid)%num.length;
           } else {
               return minI+mid;
           }
        } else if(num[mid] > target) {
            System.out.println("checking first half");
            
            return searchMid(num, low, mid-1, target, minI);
        } else if(num[mid] < target){
            System.out.println("checking second half");
            
            return searchMid(num, mid+1, high, target, minI);
        }
           
        }
        
        return -1;
    } 
}