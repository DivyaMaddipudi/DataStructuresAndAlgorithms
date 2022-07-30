class Solution {
    List<List<Integer>> result;
    int[] vis;
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
       
        result = new ArrayList<>();
        vis= new int[graph.length];
        
        dfs(graph, 0, new ArrayList<>());
        // System.out.println(Arrays.toString(vis));
        
        return result;
    }
    
    private void dfs(int[][] graph, int node, List<Integer> al) {
        
        //base case
        al.add(node);
        if(node == graph.length-1) {
            result.add(al);
            // System.out.println(al);
            return;
        }
        
        // vis[node] = 1;
        //logic
        for(int it : graph[node]) {
            
            System.out.println(it + " it ");
            if(vis[it] != 1) {
                
                // action
                vis[it] = 1;
                
                // recurse
                dfs(graph, it, new ArrayList<>(al));
                
                // backtack
                vis[it] = 0;
                
            }
            
        }
        
    }
}