class Solution {
    public int numberOfBeams(String[] bank) {
        
        int m = bank.length;
        int n = bank[0].length();
       
        int[][] matrix = new int[m][n];
        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                matrix[i][j] = Integer.valueOf(bank[i].charAt(j)-'0');
            }
        }
        
        int count = 0;
        int prev = 0;
        for(int i=0;i<m;i++) {
            int rowOne = 0;
            for(int j=0;j<n;j++) {
                if(matrix[i][j] == 1) {
                    rowOne++;
                    
                }
            }
            count = count + (prev * rowOne);
            if(rowOne != 0) {
                prev=rowOne;
            }
            
        }
        return count;
        
    }
}