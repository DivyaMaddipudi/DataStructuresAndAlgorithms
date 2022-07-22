class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        
        Queue<int[]> queue = new LinkedList<>();
        int[][] dirs = {{-1, 0}, {1,0},{0,-1},{0,1}};
        int m = image.length;
        int n = image[0].length;
        
        if(image[sr][sc] != color) {
             queue.add(new int[]{sr, sc});
        }
        int cellValue = image[sr][sc];
        while(!queue.isEmpty()) {
            int[] curr = queue.poll();
            image[curr[0]][curr[1]] = color;
            // System.out.println(Arrays.toString(curr) + " " + cellValue);
            for(int[] dir: dirs) {
                
                int nr = curr[0] + dir[0];
                int nc = curr[1] + dir[1];
                // System.out.println(nr + " new row new col " + nc);
                if(nr >= 0 && nr < m && nc>=0 && nc < n && image[nr][nc] == cellValue){
                    queue.add(new int[] {nr, nc});
                }
            }
        }
        
        return image;
    }
}