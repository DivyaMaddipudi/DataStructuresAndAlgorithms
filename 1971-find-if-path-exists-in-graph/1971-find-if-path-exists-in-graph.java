class Solution {
    ArrayList<ArrayList<Integer>> adj;
    int dest;
    int[] vis;
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        if(source == destination ) return true;
        adj = new ArrayList<ArrayList<Integer>>();
        dest = destination;
        vis = new int[n];
        
        for(int i=0;i<n;i++) {
            adj.add(new ArrayList<>());
        }
        
        for(int i=0;i<edges.length;i++) {
            adj.get(edges[i][0]).add(edges[i][1]);
            adj.get(edges[i][1]).add(edges[i][0]);
        }
        bfs(source);
        System.out.println(Arrays.toString(vis));
        if(vis[source] == 1 && vis[destination] == 1) {
            return true;
        }
        return false;
    }
    private void bfs(int source) {
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