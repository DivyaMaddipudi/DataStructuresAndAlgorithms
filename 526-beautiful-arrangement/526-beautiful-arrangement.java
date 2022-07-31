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
            // System.out.println(count + " count ");
            return;
        }
        
        
        for(int i=1;i<=n;i++) {
            if(!al.contains(i)) {
                // System.out.println((al.size()+1)%i + "  " + i%(al.size()+1));
                if((al.size()+1)%i == 0 || i%(al.size()+1) == 0) {
                     al.add(i);
                    // System.out.println( i + " " + " after adding " + al.size() + " al size " + al);
                    helper( index+1, n, al);
                    al.remove(al.size()-1);
                }
               
            }
        }
        // return count;
        
    }
}