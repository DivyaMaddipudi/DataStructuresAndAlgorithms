class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        ArrayList<List<Integer>> ans= new ArrayList<List<Integer>>();
        ArrayList<Integer> first_row = new ArrayList<>();
        first_row.add(1);
        ans.add(first_row);
        for(int i=1;i<numRows;i++) {
            List<Integer> prev_row = ans.get(i-1);
            ArrayList<Integer> curr_row = new ArrayList<>();
            curr_row.add(1);
            System.out.println(prev_row);
            
            for(int j=0;j<i-1;j++) {
                curr_row.add(prev_row.get(j) + prev_row.get(j+1));
            }
            curr_row.add(1);
            
            ans.add(curr_row);
        }
        return ans;
    }
}