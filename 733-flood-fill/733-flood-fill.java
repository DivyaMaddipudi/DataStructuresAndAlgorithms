class Solution {
    int[][] dirs = {{-1, 0}, {1,0},{0,-1},{0,1}};
    int temp;
    int m;
    int n;
    int col;
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        //DFS
        if(image[sr][sc] == color) return image;
        m = image.length;
        n = image[0].length;
        col = color;
        temp = image[sr][sc];
        dfs(sr, sc, image);
        
        // BFS
//         Queue<int[]> queue = new LinkedList<>();
//         int m = image.length;
//         int n = image[0].length;
        
//         if(image[sr][sc] != color) {
//              queue.add(new int[]{sr, sc});
//         }
//         int cellValue = image[sr][sc];
//         while(!queue.isEmpty()) {
//             int[] curr = queue.poll();
//             image[curr[0]][curr[1]] = color;
//             // System.out.println(Arrays.toString(curr) + " " + cellValue);
//             for(int[] dir: dirs) {
                
//                 int nr = curr[0] + dir[0];
//                 int nc = curr[1] + dir[1];
//                 // System.out.println(nr + " new row new col " + nc);
//                 if(nr >= 0 && nr < m && nc>=0 && nc < n && image[nr][nc] == cellValue){
//                     queue.add(new int[] {nr, nc});
//                 }
//             }
//         }
//         return image;
        return image;
    }
    
    private void dfs(int sr, int sc, int[][] image) {
        
      image[sr][sc] = col;  
      for(int[] dir : dirs) {
          int nr = sr + dir[0];
          int nc = sc + dir[1];
            if(nr >= 0 && nr < m && nc >= 0 && nc < n && image[nr][nc] == temp) {
                dfs(nr, nc, image);
            }
      }
        
    }
}