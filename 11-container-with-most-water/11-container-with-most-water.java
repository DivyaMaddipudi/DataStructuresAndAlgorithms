class Solution {
    public int maxArea(int[] height) {
        
        
        //Optimized
        int max = Integer.MIN_VALUE;
        int low = 0;
        int high = height.length - 1;
        while(low <= high) {
            max = Math.max(max, (high - low)*(Math.min(height[low], height[high])));
            if(height[low] < height[high]) {
                low++;
            } else {
                high--;
            }
        }
        
        
        //Brute force
        
        // int max = Integer.MIN_VALUE;
        // for(int i=0;i<height.length;i++) {
        //     for(int j=i+1;j<height.length;j++) {
        //         max = Math.max(max, (j-i)*Math.min(height[i], height[j]));
        //     }
        // }
        
        return max;
    }
}