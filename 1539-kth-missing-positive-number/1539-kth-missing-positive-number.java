class Solution {
    public int findKthPositive(int[] arr, int k) {
        
        int count = 0;
        int value = 0;
        List<Integer> al = new ArrayList<Integer>();
         boolean found = false;
        for(int i=1;i<=10001;i++) {
           found = search(arr, i);
            if(!found) {
               al.add(i);
            }
        }
        return al.get(k-1);
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