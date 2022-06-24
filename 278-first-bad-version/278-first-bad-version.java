/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int index = 0;
        int l=1;
        int r=n;
        int firstBad = Integer.MAX_VALUE;
        while(l<=r) {
            int mid = l + (r-l)/2;
            if(isBadVersion(mid)) {
                // check in first array
                r = mid - 1;
                firstBad = Math.min(firstBad, mid);
                
            } else {
                // check in second array
                l = mid + 1;
                
            }
           
        }
        return firstBad;
    }
}