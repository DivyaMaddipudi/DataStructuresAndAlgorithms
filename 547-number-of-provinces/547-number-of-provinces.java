class Solution {
    int[] vis;
    ArrayList<ArrayList<Integer>> al;
    public int findCircleNum(int[][] isConnected) {
        
        int size = isConnected.length;
        al = new ArrayList<ArrayList<Integer>>();
        vis = new int[size];
        
        for(int i=0;i<size;i++) {
            al.add(new ArrayList<>());
        }
        
        for(int i=0;i<size;i++) {
            for(int j=0;j<isConnected[0].length;j++) {
                if(isConnected[i][j] == 1) {
                    al.get(i).add(j);
                }
            }
        }
        System.out.println(al);
        int count = 0;
        for(int i=0;i<size;i++) {
            if(vis[i] != 1) {
                count++;
                bfs(i);
            }
        }
        return count;
    }
    
    public void bfs(int i) {
        Queue<Integer> q = new LinkedList<>();
        q.add(i);
        vis[i] = 1;
        while(!q.isEmpty()) {
            int curr = q.poll();
            for(int it : al.get(curr)) {
                if(vis[it] != 1) {
                    vis[it] = 1;
                    q.add(it);
                }
            }
        }
    }
    
}