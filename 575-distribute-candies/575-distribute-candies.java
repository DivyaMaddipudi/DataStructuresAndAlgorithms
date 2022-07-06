class Solution {
    public int distributeCandies(int[] candyType) {
        
        int n = candyType.length;
        int canEat = n/2;
        Arrays.sort(candyType);
        int count = 1;
        for(int i=1;i<n;i++) {
           if(count < canEat) {
                if(candyType[i] != candyType[i-1]) {
                    count++;
                }
           }
        }
        return count;
    }
}