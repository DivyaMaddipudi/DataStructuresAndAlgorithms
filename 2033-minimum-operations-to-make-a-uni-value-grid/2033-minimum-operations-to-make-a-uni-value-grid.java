class Solution {
    
    public int minOperations(int[][] grid, int x) {
        
        int rem = grid[0][0]%x;
        int m = grid.length;
        int n = grid[0].length;
        
        for(int i=0;i<grid.length;i++) {
            for(int j=0;j<grid[0].length;j++) {
                if(grid[i][j]%x != rem) {
                    return -1;
                }
            }
        }
        
        int[] arr = new int[m*n];
        int index = 0;
        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                arr[index++] = grid[i][j];
            }
        }
        
        Arrays.sort(arr);
        ArrayList<Integer> medians = new ArrayList<>();
        int mid = arr.length/2;
        if(arr.length%2 == 0) {
            medians.add(arr[mid-1]);
            medians.add(arr[mid]);
        } else {
            medians.add(arr[mid]);
        }
        
        System.out.println(medians);
        
        int min = Integer.MAX_VALUE;
        for(int j=0;j<medians.size();j++) {
            int count = 0;
            for(int i=0;i<arr.length;i++) {
                count += Math.abs(arr[i] - medians.get(j))/x;
            }
            System.out.println(count);
            min = Math.min(min, count);
        }
        
        
        System.out.println(Arrays.toString(arr));
        return min;
    }
}