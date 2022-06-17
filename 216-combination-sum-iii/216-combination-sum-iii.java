class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        int[] nums = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9};
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        List<Integer> al = new ArrayList<Integer>();
        
        backtrack(0, k, n, al, ans, nums);
        
        return ans;
    }
    
    public void backtrack(int index, int k, int target, List<Integer> al, List<List<Integer>> ans, int[] nums) {
        
        if(target == 0 && al.size() == k) {
            ans.add(new ArrayList<>(al));
            return;
        }
        
        for(int i=index;i<nums.length;i++) {
            if(nums[i] > target) break;
            al.add(nums[i]);
            backtrack(i+1, k, target-nums[i], al, ans, nums);
            al.remove(al.size()-1);
        }
    }
}