class Solution {
    public void setZeroes(int[][] matrix) {
        
        int n = matrix.length;
        int m = matrix[0].length;
        ArrayList<Integer> row = new ArrayList<Integer>();
        ArrayList<Integer> col = new ArrayList<Integer>();
        
        
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                if(matrix[i][j] == 0) {
                   if(!row.contains(i) && !col.contains(j)) {
                       row.add(i);
                       col.add(j);
                   } else if(row.contains(i) && !col.contains(j)) {
                       col.add(j);
                   } else if(!row.contains(i) && col.contains(j)) {
                       row.add(i);
                   }
                }
            }
        }
        
        for(int i=0;i<row.size();i++) {
            for(int j=0;j<m;j++) {
                matrix[row.get(i)][j] = 0;
            }
        }
        
        for(int i=0;i<col.size();i++) {
            for(int j=0;j<n;j++) {
                matrix[j][col.get(i)] = 0;
            }
        }
        
    }
}