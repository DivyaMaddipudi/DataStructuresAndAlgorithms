class Solution {
    public int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
        Arrays.sort(horizontalCuts);
        Arrays.sort(verticalCuts);
        
        long num = 1000000007;
        long maxVDiff = 0;
        long maxHDiff = 0;
        
        
        maxVDiff = calculateMaxDifference(horizontalCuts, h);
        maxHDiff = calculateMaxDifference(verticalCuts, w);
      
        int ans = (int) ((maxVDiff*maxHDiff)%num);
        return ans;
        
    }
    
    private long calculateMaxDifference(int[] arr, int n) {
        long diff = Integer.MIN_VALUE;
        
        int min = arr[0];
        int max = arr[arr.length - 1];
        if(arr.length > 1) {
            for(int i=1;i<arr.length;i++) {
                diff = Math.max(diff, arr[i] - arr[i-1]);
            } 
            diff = Math.max(diff, Math.max(arr[0], n - max));
        } else {
            System.out.println(n + " " + arr[0]);
            
            diff = Math.max(arr[0], n - arr[0]);
        }
        System.out.println(diff);
        
        return diff;
    }
}