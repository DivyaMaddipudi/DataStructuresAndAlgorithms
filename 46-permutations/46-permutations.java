class Solution {
    public List<List<Integer>> permute(int[] nums) {
        
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        List<Integer> al = new ArrayList<Integer>();
        
        backtrack(nums, ans, al);
        return ans;
    }
    
    public void  backtrack( int[] nums, List<List<Integer>> ans,  List<Integer> al) {
        
        if(al.size() == nums.length) {
            System.out.println(al);
            ans.add(new ArrayList<>(al));
            return;
        }
        
        for(int i=0;i<nums.length;i++) {
            if(!al.contains(nums[i])) {
                al.add(nums[i]);
                backtrack( nums, ans, al);
                al.remove(al.size() - 1);
            }
        }
    }
}