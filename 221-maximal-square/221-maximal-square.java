class Solution {
    public int maximalSquare(char[][] matrix) {
        
        int m = matrix.length;
        int n = matrix[0].length;
        int max = 0;
        
        
        int[][] dp = new int[m+1][n+1];
        System.out.println(dp.length + " DP " + dp[0].length);
        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                if(matrix[i][j] == '1') {
                    dp[i+1][j+1] = Math.min(Math.min(dp[i][j+1], dp[i+1][j]), dp[i][j])+1;
                    max = Math.max(max, dp[i+1][j+1]);
                }
            }
        }
       
        for(int i=0;i<m+1;i++) {
            for(int j=0;j<n+1;j++) {
                System.out.print(dp[i][j]);
            }
             System.out.println();
        }
        
        return max*max;
    }
}