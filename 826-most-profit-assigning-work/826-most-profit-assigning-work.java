class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        
        if(worker == null && worker.length == 0) return 0;
        int maxTaskProfit = 0;
        int maxProfit = 0;
        for(int i=0;i<worker.length;i++) {
            maxTaskProfit = 0;
            for(int j=0;j<difficulty.length;j++) {
                if(worker[i] >= difficulty[j]) {
                    maxTaskProfit = Math.max(maxTaskProfit, profit[j]);
                }
            }
            System.out.println(maxTaskProfit);
           maxProfit = maxProfit + maxTaskProfit;
            
        }
        
        return maxProfit;
    }
}