class Solution {
    public int shipWithinDays(int[] weights, int days) {
        
        int low = Integer.MIN_VALUE;
        int high = 0;
        
        for(int i=0;i<weights.length;i++) {
            low = Math.max(low, weights[i]);
            high += weights[i];
        }
        
        while(low<high) {
            int mid = low + (high-low)/2;
            
            
            int daysCount=1;
            int sum=0;
            for(int num:weights) {
                if(sum + num > mid) {
                    sum = num;
                    daysCount++;
                } else {
                    sum += num;
                }
            }
            
            if(daysCount > days) {
                 low = mid + 1;
            } else {
                high = mid;
            }
        }
        
        return high;
        
    }
}