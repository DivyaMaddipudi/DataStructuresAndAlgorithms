class Solution {
    
    int[][] vis;
    int m;
    int n;
    int[][] dirs = new int[][] {{-1,0}, {1,0}, {0,-1},{0,1}};
    public boolean exist(char[][] board, String word) {
        if(board.length == 0 || board == null) return false;
        m = board.length;
        n = board[0].length;
        vis = new int[m][n];
        
        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                // if(vis[i][j] == word.charAt(0)) {
                    // vis[i][j] = 1;
                    // System.out.println(vis[i][j]);
                    if(helper(board, word, i, j, "", 0)) {
                        return true;
                    }
                // }
            }
        }
        
        return false;
    }
    
    private boolean helper(char[][] board, String word, int row, int col, String path, int index) {
        // base

        if(index == word.length()) {
            System.out.println(path);
            return true;
        }
        
        if(row < 0 || row >= m || col < 0 || col >= n || vis[row][col] == 1) return false;
        // vis[row][col] = 1;
        // logic
        
        if(word.charAt(index) == board[row][col]) {
            vis[row][col] = 1;
            for(int[] dir : dirs) {
                int nr = row + dir[0];
                int nc = col + dir[1];
                if(helper(board, word, nr, nc, path+board[row][col], index+1)) {
                    return true;
                }
            }
            vis[row][col] = 0;
        }
        return false;
    }
}