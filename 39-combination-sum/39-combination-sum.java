class Solution {
    int val;
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        List<Integer> al = new ArrayList<>();
        val = target;
        int size = candidates.length;
        combinations(0, candidates, 0, ans, al, size);
        return ans;
    }
    
    public void combinations(int index, int[] cands, int target,  List<List<Integer>>  ans, List<Integer> al, int size) {
        
        if(index == size) {
            if(target == val) {
                 ans.add(new ArrayList<>(al));
            }
            return;
        }
        if(target < val) {
            al.add(cands[index]);
            combinations(index, cands, target+cands[index], ans, al, size);
            al.remove(Integer.valueOf(cands[index]));
        }
        combinations(index+1, cands, target, ans, al, size);
    }
}