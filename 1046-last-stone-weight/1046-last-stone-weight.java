class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        
       
        for(int i=0;i<stones.length;i++) {
            pq.add(stones[i]);
        }
        
        while(pq.size() > 1) {
            int diff = Math.abs(pq.poll() - pq.poll());
            if(diff != 0) {
                pq.add(diff);
            }
        }
        if(pq.size() != 0) {
            return pq.poll();
        }
        return 0;
    }
    
    private void reverseArray(int[] stones) {
        for(int i=0;i<stones.length/2;i++) {
            int temp = stones[i];
            stones[i] = stones[stones.length-i-1];
            stones[stones.length-i-1] = temp;
        } 
    }
}