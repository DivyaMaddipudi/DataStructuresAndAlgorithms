class Solution {
    public int maximum69Number (int num) {
        int digitsCount = (int) Math.log10(num) + 1;
        int[] numsArr = new int[digitsCount];
        String str = String.valueOf(num);
        for(int i=0;i<digitsCount;i++) {
           numsArr[i] = (int) str.charAt(i)-'0';
        }
        int max = num;
        for(int i=0;i<digitsCount;i++) {
            int temp = numsArr[i];
            System.out.println(Arrays.toString(numsArr));
            
            if(numsArr[i] == 6) {
                numsArr[i] = 9;
               
            } else if(numsArr[i] == 9) {
                numsArr[i] = 6;
                
            }
            System.out.println(Arrays.toString(numsArr) + " After");
            
            int value = 0;
            for(int j=0;j<digitsCount;j++) {
                value = (int)  (value * Math.pow(10, 1))+ numsArr[j];
            }
            // System.out.println(value + " value ");
            
            max = Math.max(max, value);
            numsArr[i] = temp;
        }
        System.out.println(max);
        return max;
        
    }
}