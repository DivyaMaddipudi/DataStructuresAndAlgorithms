class Solution {
    public String reversePrefix(String word, char ch) {
        
        int high = 0;
        for(int i=0;i<word.length();i++) {
            if(word.charAt(i) == ch) {
                System.out.println(i);
                high = i;
                break;
            }
        }
        
        int l = 0;
        int r = high;
        String first = word.substring(0, high+1);
        String second = word.substring(high+1, word.length());

        char[] chArr = first.toCharArray();
        while(l<r){
            char temp = chArr[l];
            chArr[l] = chArr[r];
            chArr[r] = temp; 
            l++;
            r--;
        }
        String rev = String.valueOf(chArr);
        return rev+second;
    }
}