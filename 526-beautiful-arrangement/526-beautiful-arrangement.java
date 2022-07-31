class Solution {
    int count;
    public int countArrangement(int n) {
        
        helper(0, n, new ArrayList<>());
        return count;
    }
    
    private void helper( int index, int n, List<Integer> al) {
        
        if(al.size() == n) {
            System.out.println(al);
            count++;
            return;
        }
        
        
        for(int i=1;i<=n;i++) {
            if(!al.contains(i)) {
                if((al.size()+1)%i == 0 || i%(al.size()+1) == 0) {
                     al.add(i);
                    helper( index+1, n, al);
                    al.remove(al.size()-1);
                }
               
            }
        }
        // return count;
        
    }
}