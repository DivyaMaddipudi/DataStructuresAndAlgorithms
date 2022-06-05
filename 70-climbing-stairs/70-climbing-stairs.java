class Solution {
    public int climbStairs(int n) {
        int sum = 0;
        int temp[] = new int[n+1];
        // Arrays.fill(temp, n);
        temp[0] = 1;
        temp[1] = 2;
       for(int i=2;i<n;i++) {
           temp[i] = temp[i-1] + temp[i-2];
           // System.out.println(temp[i]);
       }
        return temp[n-1];
    }
}