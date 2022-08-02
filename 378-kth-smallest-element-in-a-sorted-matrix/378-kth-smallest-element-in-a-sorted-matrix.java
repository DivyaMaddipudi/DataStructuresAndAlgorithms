class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        if(matrix == null || matrix.length == 0) return 0;
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>((a, b) -> (a-b));
        int m = matrix.length;
        
        for(int i=0;i<m;i++) {
            for(int  j=0;j<m;j++) {
                pq.add(matrix[i][j]);   
            }
        }
        
        
        for(int i=1;i<k;i++) {
            // pq.poll();
            System.out.println(pq.poll());
        }
        
        return pq.peek();
    }
}