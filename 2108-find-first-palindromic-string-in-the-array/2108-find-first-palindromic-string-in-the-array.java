class Solution {
    public String firstPalindrome(String[] words) {
        
        String output = "";
        for(int i=0;i<words.length;i++) {
                // System.out.println(words[i] + " inside for ");
            
            if(reverse(words[i]).equals(words[i])) {
                // System.out.println(words[i]);
                output = words[i];
                break;
            }
        }
        return output;
    }
    
    public String reverse(String str) {
        char ch[] = str.toCharArray();
        int l = 0;
        int r = ch.length-1;
        while(l<r){
            char temp = ch[l];
            ch[l] = ch[r];
            ch[r] = temp;
            l++;
            r--;
        }
        String str1 = String.valueOf(ch);
        return str1;
    }
}