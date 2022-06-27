class Solution {
    public int maximumCandies(int[] candies, long k) {
        // if(candies.length <= 2 && getSum(candies) <k) return 0;
//         if(getSum(candies) == k) return 1;
        
        int low = 0;
        int high = 10_000_000;
        while(low < high) {
            
            int mid = (low + high + 1)/2;
            
            long count = 0;
            for(int pile : candies) {
                count += pile/mid;
                // if(pile%mid != 0) {
                //     count++;
                // }
              
            }
            System.out.println(count + " count ");
            
            if(count < k) {
                high = mid - 1;
            } else {
                low = mid;
                // return high;
            } 
            System.out.println( mid + " mid " + low + " low  high " + high);
            
        }
        
//         if(high < low) {
//             return high;
//         }
       
        
        return low;
    }
    public int getMax(int[] candies) {
        int high = Integer.MIN_VALUE;
        
        for(int pile: candies) {
            high = Math.max(high, pile);
        }
        return high;
    }
    
     public int getSum(int[] candies) {
        int sum = 0;
        
        for(int pile: candies) {
            sum += pile;
        }
        System.out.println( sum );
         
        return sum;
    }
}