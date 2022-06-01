class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        
        for(int i=0;i<image.length;i++) {
            reverse(image[i]); 
            flipNumber(image[i]);   
            
        }
        return image;
    }
    
    public void flipNumber(int[] arr) {
        int l = 0;
        int r = arr.length-1; 
        
        for(int i=0;i<=r;i++) {
            if(arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }
        
    }
    
    public void reverse(int[] arr) {
        int l = 0;
        int r = arr.length-1; 
        int mid = (l+r)/2;
        while(l<=r) {
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--; 
        }   
    }
}