class Solution {
    public int findCenter(int[][] edges) {
        int nodes = edges.length+1;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();
        
        // System.out.println(nodes);
        
        for(int i=0;i<=nodes;i++) {
            adj.add(new ArrayList<>());    
        }
        
        for(int i=0;i<edges.length;i++) {
            adj.get(edges[i][0]).add(edges[i][1]);
            adj.get(edges[i][1]).add(edges[i][0]);
        }
        
        for(int i=0;i<adj.size();i++) {
            if(adj.get(i).size() == edges.length) {
                return i;
            }
        }
        return 0;
    }
}