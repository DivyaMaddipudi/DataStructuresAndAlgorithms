class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int j = 0;
        int newRow = 0;
        for(int row=0;row<matrix.length-1;row++) {
            System.out.println(matrix[row].length);
            
           if(matrix[row][j] <= target) {
               if(matrix[row+1][j] > target) {
                    newRow = row;
               } else if (matrix[row+1][j] <= target) {
                   newRow = row+1;
               }
            } 
        }
        
        for(int col = 0;col<matrix[newRow].length;col++) {
            if(matrix[newRow][col] == target) {
                return true;
            }
        }
        return false;
    }
}