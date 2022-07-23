class Solution {
    int[] vis;
    ArrayList<ArrayList<Integer>> adj;
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        ArrayList<Integer> result = new ArrayList<>();
        adj = new ArrayList<ArrayList<Integer>>();
        vis = new int[n];
        
        for(int i=0;i<n;i++) {
            adj.add(new ArrayList<>());
        }
        
        for(int i=0;i<edges.size();i++) {
            adj.get(edges.get(i).get(1)).add(edges.get(i).get(0));
        }
        
        for(int i=0;i<n;i++) {
            if(vis[i] == 0) {
                bfs(i);
            }
        }
        
        for(int i=0;i<n;i++) {
            if(adj.get(i).size() == 0) {
                result.add(i);
            }
        }
        
        // System.out.println(adj);
        
        return result;
        
    }
    
    private void bfs(int i) {
        vis[i] = 1;
        Queue<Integer> q = new LinkedList<>();
        q.add(i);
        while(!q.isEmpty()) {
            int cur = q.poll();
            for(int it : adj.get(cur)) {
                if(vis[it] == 0) {
                    vis[it] = 1;
                    q.add(it);
                }
            }
        }
    }
}