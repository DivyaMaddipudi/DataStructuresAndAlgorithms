class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        List<Integer> al = new ArrayList<>();
        al.add(1);
        ans.add(al);
        
        for(int i=1;i<numRows;i++) {
            
            List<Integer> prev = ans.get(i-1);
            List<Integer> curr = new ArrayList<>();
            curr.add(1);
            
            for(int j=0;j<i-1;j++) {
                curr.add(prev.get(j) + prev.get(j+1));
            }
            curr.add(1);

            ans.add(curr);
        }
        
        return ans;
    }
}