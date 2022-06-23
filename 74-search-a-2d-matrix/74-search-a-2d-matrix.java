class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int i = 0; 
        int j = matrix[0].length-1;
        
        while(i<matrix.length && j>=0) {
            System.out.println(matrix[i][j] + " --- " + i + " " + j);
            if(matrix[i][j] == target) {
                return true;
            } else if(matrix[i][j] < target) {
                i++;
            } else if(matrix[i][j] > target) {
                j--;
            }
        }
        return false;
        
//         int j = 0;
//         int newRow = 0;
//         for(int row=0;row<matrix.length-1;row++) {
//             System.out.println(matrix[row].length);
            
//            if(matrix[row][j] <= target) {
//                if(matrix[row+1][j] > target) {
//                     newRow = row;
//                } else if (matrix[row+1][j] <= target) {
//                    newRow = row+1;
//                }
//             } 
//         }
        
//         for(int col = 0;col<matrix[newRow].length;col++) {
//             if(matrix[newRow][col] == target) {
//                 return true;
//             }
//         }
//         return false;
    }
}