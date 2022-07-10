class Solution {
    public List<Integer> getRow(int rowIndex) {
        // ArrayList<ArrayList<Integer>> triangle = new List<List<>>();
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        // triangle.add(al);
        
        for(int i=1;i<rowIndex+1;i++) {
            ArrayList<Integer> curr_row = new ArrayList<>();
            
            curr_row.add(1);
            for(int j=0;j<i-1;j++) {
                curr_row.add(al.get(j) + al.get(j+1));
            }
            curr_row.add(1);
            
            al = curr_row;
            
        }
        return al;
    }
}