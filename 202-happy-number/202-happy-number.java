class Solution {
    public boolean isHappy(int n) {
        
        Boolean isHappyNumber = false;
       
        int result = n;  
      
        while(result != 1 && result != 4){  
            result = happyNumberSquare(result);  
        }  
        
        if(result == 1)  
            isHappyNumber = true;
        else if(result == 4)
            isHappyNumber = false;
        
        return isHappyNumber;
                     

        
    }
    
    public int happyNumberSquare(int n) {
         int rem = 0;
        int sum = 0;
        
        while( n > 0 ) {
            rem = n%10;
            sum = sum + (rem*rem);
            n = n/10;
        }
        return sum;
    }
}