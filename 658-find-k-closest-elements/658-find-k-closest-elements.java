class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        if(arr.length == 0 || arr == null) return new ArrayList<>();
        
        //two pointer
        
        int l = 0;
        int r = arr.length - 1;
        
        while(r-l+1 != k) {
            int leftDiff = x - arr[l];
            int rightDiff = arr[r] - x;
            
            if(leftDiff>rightDiff) {
                l++;
            } else {
                r--;
            }
        }
        // System.out.println(l + " " + r);
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=l;i<=r;i++) {
            al.add(arr[i]);
        }
        return al;
    }
}