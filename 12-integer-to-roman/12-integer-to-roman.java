class Solution {
    String[] below_10 = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
    public String intToRoman(int num) {
      
        String result="";
        int power = String.valueOf(num).length() - 1; 
        int position = (int) Math.pow(10, power);
        int val = num/position * position;
         if(power == 3) {
            result +=  toRoman(num);
            return result;
        } if(power == 2) {
            result +=  toRoman(num);
            return result;
        } else if(power == 1) {
            result +=  toRoman(num);
            return result;
        } else {
            result +=  below_10[num/position];
            return result;
        }
    }
    
    private String toRoman(int num) {
        String[] tens = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC", "C"};
        String[] hundreds = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM", "M"};
        String[] thousands = {"", "M", "MM", "MMM"};
        
        int power = String.valueOf(num).length() - 1; 
        int position = (int) Math.pow(10, power);
        int val = num/position * position;
        if(num >= 1000) {
            return thousands[num/position]  + toRoman(num%position);
        } else if(num >= 100 && num < 1000) {
            return hundreds[num/position] + toRoman(num%position);
        } else if(num < 100 && num >= 10) {
            return tens[num/position] + toRoman(num%position);
        } else {
            return below_10[num/position];
        }
    }
}