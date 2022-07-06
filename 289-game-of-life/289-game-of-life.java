class Solution {
    public void gameOfLife(int[][] board) {
     
        int n = board.length;
        int m = board[0].length;
        
        
        // 0 ---> 1 = 2
        // 1 ---> 0 = 3
        
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                int countAdjLives = adjLives(board, i, j);
                
                if(board[i][j] == 1) {
                    if(countAdjLives < 2) {
                        board[i][j] = 3;
                    } else if(countAdjLives == 2 || countAdjLives == 3) {
                        board[i][j] = board[i][j];
                    } else {
                        board[i][j] = 3;
                    }
                } else {
                    if(countAdjLives == 3) {
                        board[i][j] = 2;
                    }
                }
            }
        }
        
        
         for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                if(board[i][j] == 2) {
                    board[i][j] = 1;
                } else if(board[i][j] == 3){
                    board[i][j] = 0;
                }
            }
         }
        
    }
    
    private int adjLives(int[][] board, int r, int c) {
        int[][] dirs = {{-1, 0}, {1, 0}, {0, -1}, {0,1}, {-1, -1}, {-1, 1}, {1, 1}, {1, -1}};
        
        int n = board.length;
        int m = board[0].length;
     
        int count = 0;
        for(int[] dir: dirs) {
            int row = r + dir[0];
            int col = c + dir[1];
            if(row >= 0 && col >=0 && row < n && col < m && (board[row][col] == 1 || board[row][col] == 3)) {
                count++;
            } 
        }
    return count;
    }
}