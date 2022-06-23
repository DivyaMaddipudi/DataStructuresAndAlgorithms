class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        System.out.println(matrix.length + " row ");
        // System.out.println(matrix[matrix.length].length + " col ");
        // if(matrx.length)
        
        // if(matrix[0][0] == target) return matrix[0][0] == target;
        
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
               // System.out.println(matrix[row+1][j] + " " + target + " T/F");
            } 
        }
        
        System.out.println(matrix[newRow].length + " row " + newRow);
        
        // if(matrix[newRow].length == 0) {
        //     return matrix[newRow][0] == target;
        // }
        for(int col = 0;col<matrix[newRow].length;col++) {
            // System.out.println(matrix[newRow][col] + " ===== ");
            
            if(matrix[newRow][col] == target) {
                return true;
            }
        }
        return false;
    }
}