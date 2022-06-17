class Solution {
    public List<List<Integer>> combine(int n, int k) {
        
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        List<Integer> al = new ArrayList<Integer>();
        
        int[] arr = new int[n];        
        for(int i=0;i<n;i++) {
            arr[i] = i+1;
        }
        
        getAllCombs(0, arr, al, ans, k);
        return ans;
    }
    
    public void getAllCombs(int index, int[] arr, List<Integer> al, List<List<Integer>> ans, int k) {
        if(index == arr.length) {
            if(al.size() == k) {
                ans.add(new ArrayList<>(al));
            }
            return;
        }
        
        al.add(arr[index]);
        getAllCombs(index+1, arr, al, ans, k);
        al.remove(Integer.valueOf(arr[index]));
        getAllCombs(index+1, arr, al, ans, k);
                    
    }
}