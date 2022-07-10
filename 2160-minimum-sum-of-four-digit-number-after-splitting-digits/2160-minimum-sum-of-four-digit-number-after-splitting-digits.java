class Solution {
    public int minimumSum(int num) {
        
        HashMap<Integer, Integer> hm = new HashMap<>();
        int[] arr = new int[10];
        while(num > 0) {
            int rem = num%10;
            arr[rem]++;
            num = num/10;
        }
        
        String num1 = "";
        String num2 = "";
        String str = "";
        for(int i=0;i<arr.length;i++) {
            while(arr[i] > 0) {
                str += String.valueOf(i);
                arr[i]--;
            }
        }
        
        for(int i=0;i<str.length();i++) {
            if(i%2 == 0) {
                num1 += str.charAt(i);
            } else {
                num2 += str.charAt(i);
            }
        }
        
        return Integer.valueOf(num1) + Integer.valueOf(num2);
    }
}