class Solution {
    public int arrangeCoins(int n) {
        int row = 1;
        int count = 0;
        int initial = n;
        while(n >= 0 ){
            n = n - row;
            int diff = initial - n;
            initial = n;
                
            if(diff == row && initial >= 0) {
                count ++;
            } else {
                break;
            }
            row++;
        }
        return count;
    }
}