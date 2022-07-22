class Solution {
    public int findJudge(int n, int[][] trust) {
        
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();
        
        for(int i=0;i<=n;i++) {
            adj.add(new ArrayList<>());
        }
        
        for(int i=0;i<trust.length;i++) {
            adj.get(trust[i][0]).add(trust[i][1]);
        }
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i=1;i<=n;i++) {
            hm.put(i, 0);
        }
        for(List<Integer> list : adj) {
                System.out.println(list);
            
            for(int i=0;i<list.size();i++) {
                System.out.println(list.get(i));
                int count = hm.get(list.get(i));
                count++;
                hm.put(list.get(i), count);
            }
        }
            System.out.println(hm);
        
        int idx = 0;
        for(int i=1;i<=n;i++) {
            if(hm.get(i) == n -1) {
                idx = i;
                if(adj.get(idx).size() == 0) {
                    return idx;
                 }
            }
        }
        
    
       
        return -1;
    }
}