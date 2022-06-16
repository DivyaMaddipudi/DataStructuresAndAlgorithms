class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        List<Integer> al = new ArrayList<>();
        int size = candidates.length;
        combinations(0, candidates, target, ans, al, size);
        return ans;
    }
    
    public void combinations(int index, int[] cands, int target,  List<List<Integer>>  ans, List<Integer> al, int size) {
        if(index == size) {
            if(target == 0) {
                 ans.add(new ArrayList<>(al));
            }
            return;
        }
        if(cands[index] <= target) {
            al.add(cands[index]);
            combinations(index, cands, target-cands[index], ans, al, size);
            al.remove(Integer.valueOf(cands[index]));
        }
        combinations(index+1, cands, target, ans, al, size);
    }
}