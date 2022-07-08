class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        
        int row=0;
        int col=0;
        
        int m = mat.length;
        int n = mat[0].length;
        int index = 0;
        int[] result = new int[m*n];
        int dir = 1; 
        //1 Upward
        //-1 Downward
            
        while(index < m*n) {
            result[index] = mat[row][col];
            
            if(dir == 1) {
                if(col==n-1) {
                    dir=-1;
                    row++;
                } else if(row ==0) {
                    dir = -1;
                    col++;
                } else {
                    row--;
                    col++;
                }
            } else {
                if(row==m-1) {
                    dir=1;
                    col++;
                } else if(col==0) {
                    dir = 1;
                    row++;
                } else {
                    row++;
                    col--;
                }
            }
            index++;
        }
        return result;
    }
}