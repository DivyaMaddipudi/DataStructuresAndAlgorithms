class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        
        int[] indegree = new int[numCourses];
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();
        int[] res = new int[numCourses];
        for(int i=0;i<numCourses;i++) {
            adj.add(new ArrayList<>());
        }
        
        for(int i=0;i<prerequisites.length;i++) {
            indegree[prerequisites[i][0]]++;
            adj.get(prerequisites[i][1]).add(prerequisites[i][0]);
        }
        
        Queue<Integer> queue = new LinkedList<>();
        for(int i=0;i<numCourses;i++) {
            if(indegree[i] == 0) {
                queue.add(i);
            } 
        }
        
        // if(queue.size() == 0) return new int[] {};
        int index = 0;
        while(!queue.isEmpty()) {
            int curr = queue.poll();
            res[index++] = curr;
            for(int it : adj.get(curr)) {
                indegree[it]--;
                if(indegree[it] == 0) {
                    queue.add(it);
                }
            }
        }
        
        if(index == numCourses) return res;
        return new int[] {};
    }
}