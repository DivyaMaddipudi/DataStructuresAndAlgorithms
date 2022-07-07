class Solution {
    public int distributeCandies(int[] candyType) {
        
        
        // TC: O(N)
        // SC: O(N)
        int n = candyType.length;
        int canEat = n/2;
        
        HashSet<Integer> set = new HashSet<>();
         for(int i=0;i<n;i++) {
           if(!set.contains(candyType[i])) {
               set.add(candyType[i]);
           }
        }
        
        if(canEat <= set.size()) {
            return canEat;
        } else {
            return set.size();
        }
        
        //TC: O(n log(n)) - for sort function 
        //SC: O(1)
        
        // int n = candyType.length;
        // int canEat = n/2;
        // Arrays.sort(candyType);
        // int count = 1;
        // for(int i=1;i<n;i++) {
        //    if(count < canEat) {
        //         if(candyType[i] != candyType[i-1]) {
        //             count++;
        //         }
        //    }
        // }
        // return count;
    }
}