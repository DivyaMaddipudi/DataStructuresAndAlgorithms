class Solution {
    public int mySqrt(int x) {
        if(x <= 1) return x;
        
        int low = 0;
        int high = x;
        while(high >= low) {
            int mid = (low + high)/2;
            
                        
            System.out.println(mid);
            if(mid == x/mid) return mid;
            
            if(mid  > x/mid) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return high;
    }
}