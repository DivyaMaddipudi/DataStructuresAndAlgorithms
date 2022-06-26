/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        
        int low = 0;
        int high = mountainArr.length()-1;
        int mid = findPeak(mountainArr);
        int indexFirst = binarySearch(target, mountainArr, low, mid);
        if(indexFirst != -1) {
            return indexFirst;
        } else{
            int indexLast = binarySearchDesc(target, mountainArr, mid+1, high);
            return indexLast;
        }
    }
    
     private int findPeak(MountainArray mountainArr) {
        
         int low = 0;
         int high = mountainArr.length();
        while(low <= high) {
            int mid = low + (high - low )/2;
            
            if((mid ==0 || mountainArr.get(mid)>mountainArr.get(mid-1)) && (mid == mountainArr.length() || mountainArr.get(mid)>mountainArr.get(mid+1))) {
                return mid;
            }
            
            if( (mid ==0 ||mountainArr.get(mid)>mountainArr.get(mid-1)) && (mid == mountainArr.length() || mountainArr.get(mid)<mountainArr.get(mid+1))) {
               low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
         return -1;
    }
    
    private int binarySearch(int target, MountainArray mountainArr, int low, int high) {
        
        while(low <= high) {
            int mid = low + (high - low )/2;
            
            if(mountainArr.get(mid) == target) {
                return mid;
            }
            
            if(target > mountainArr.get(mid)) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
    
     private int binarySearchDesc(int target, MountainArray mountainArr, int low, int high) {
        
        int val = low + (high - low )/2;
         
        while(low <= high) {
            int mid = low + (high - low )/2;
            
            if(mountainArr.get(mid) == target) {
                return mid;
            }
            
            if(target > mountainArr.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
         return -1;
    }
    
}