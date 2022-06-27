class Solution {
    public int findKthPositive(int[] arr, int k) {
        
        int low = 0;
        int high = arr.length - 1;
        
        while(low <= high) {
            
            int mid = low + (high - low)/2;
            
           
            
            if(arr[mid] - mid > k) {
                if(mid - 1 < 0) {
                    high = 0;
                    break;
                }
                high = mid - 1;
                System.out.println(" high = low " + high + " = " + low);
                
            } else {
                low = mid + 1;
            }
            
           
        }
        
        System.out.println(" high = low " + high + " = " + low);
        
        if(high == 0 && (arr[high] -high > k )) {
            int value = (arr[high] - high - 1);
            
            return arr[high]-value+(k-1);
        } else {
             int value = k - (arr[high] - high - 1);
             System.out.println(arr[high] + " " + value);
             return arr[high] + value;
        }
       
    }
    
    private boolean search(int[] arr, int num) {
        
        for(int j=0;j<arr.length;j++) {
            if(arr[j] == num) {
                 return true;
            }
        }
        return false;
    }
}