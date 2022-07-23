class Solution {
    // ArrayList<ArrayList<Integer>> adj;
    int[] vis;
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        // adj = new ArrayList<ArrayList<Integer>>(rooms);
        int n = rooms.size();
        vis = new int[n];
        
        bfs(0, rooms);
        
        for(int i=0;i<n;i++) {
            if(vis[i] != 1) {
                return false;
            }
        }
        return true;
    }
    
     private void bfs(int source, List<List<Integer>> adj) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(source);
        vis[source] = 1;
        
        while(!queue.isEmpty()) {
            int curr = queue.poll();
            for(int it : adj.get(curr)) {
                if(vis[it] == 0) {
                    vis[it] = 1;
                    queue.add(it);
                } 
            }
        }
     }
}