class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        
        // BFS
        int[] indegree = new int[numCourses];
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();
        
        for(int i=0;i<numCourses;i++) {
            adj.add(new ArrayList<>());
        }
         
        for(int i=0;i<prerequisites.length;i++) {
            indegree[prerequisites[i][0]]++;
            adj.get(prerequisites[i][1]).add(prerequisites[i][0]);
        }
        
        // System.out.println(Arrays.toString(indegree));
        Queue<Integer> queue = new LinkedList<>();
        for(int i=0;i<numCourses;i++) {
            if(indegree[i] == 0) {
                queue.add(i);
            }
        }
        
        int count = 0;
        while(!queue.isEmpty()) {
            int curr = queue.poll();
            count++;
            for(int it: adj.get(curr)) {
                indegree[it]--;
                if(indegree[it] == 0) {
                    queue.add(it);
                }
            }
        }
        if(count == numCourses) return true;
        return false;
    }
}