class Solution {
    public int fillCups(int[] amount) {
        
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> (b - a));
        
        for(int amt: amount) {
            if(amt != 0) {
                pq.add(amt);
            }
        }
        
        int count = 0;
        while(!pq.isEmpty()) {
            System.out.println(pq);
            
            if(pq.peek() == 0) {
                pq.poll();
                continue;
            }
            
            int w1 = 0;
            int w2 = 0;
            if(pq.size() == 1) {
                w1 = pq.poll();
            } else {
                 w1 = pq.poll();
                 w2 = pq.poll();
            }
            if(w1 >= 1 && w2 >= 1) {
                w1--;
                w2--;
                pq.add(w1);
                pq.add(w2);
            } else if(w2 >= 1) {
                w2--;
                pq.add(w2);
            } else if(w1 >= 1) {
                w1--;
                pq.add(w1);
            }
            count++;            
        }
        return count;
        
    }
}