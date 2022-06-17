class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        List<Integer> al = new ArrayList<Integer>();
        Arrays.sort(candidates);
        
        backtrack(0, candidates, target, al, ans);
        for(int i=0;i<candidates.length;i++) {
            System.out.println(candidates[i]);
        }
        
        
        return ans;
    }
    
    public void backtrack(int index, int[] cands, int target, List<Integer> al, List<List<Integer>> ans) {
        if(target == 0) {
            // System.out.println(al);
            ans.add(new ArrayList<>(al));
            return;
        }
        
            // System.out.println(index);
        
        for(int i=index;i<cands.length;i++) {
            
            if(i>index && cands[i] == cands[i-1]) {
                // System.out.println(i +" " +index);
                // System.out.println(cands[i] +" " +cands[i-1]);
                
                continue;
            }
            if(cands[i] > target) break;
            
            al.add(cands[i]);
            backtrack(i+1, cands, target-cands[i], al, ans);
            al.remove(al.size()-1);
        }
    }
}