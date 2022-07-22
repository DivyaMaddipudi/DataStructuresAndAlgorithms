class Solution {
    int[] vis;
    ArrayList<ArrayList<Integer>> adj;
    List<Boolean> containsApple;
    int result;
    public int minTime(int n, int[][] edges, List<Boolean> hasApple) {
       
        adj = new ArrayList<ArrayList<Integer>>();
        containsApple = new ArrayList<>(hasApple);
        for(int i=0;i<n;i++) {
            adj.add(new ArrayList<>());
        }
        
        for(int i=0;i<edges.length;i++) {
            adj.get(edges[i][0]).add(edges[i][1]);
            adj.get(edges[i][1]).add(edges[i][0]);
            
        }
        
        vis = new int[n];
        System.out.println(Arrays.toString(vis));


        for(int i=0;i<n;i++) {
            if(vis[i]==0) {
                result += dfs(i);
            } 
        }
      
        return result;
    }
    private int dfs(int node) {
        int totalTime = 0;
        
        // base case
        vis[node] = 1;
        // logic
        
        for(int it: adj.get(node)) {
            if(vis[it] == 0) {
                totalTime += dfs(it);
            } 
        }
        
        
        if(node != 0 && (containsApple.get(node) || totalTime > 0)) {
            totalTime += 2;
        }
        
       
        System.out.println(node  + " " + totalTime);
        System.out.println(containsApple.get(node));
        
        
        return totalTime;
    }
}