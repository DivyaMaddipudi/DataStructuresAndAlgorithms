class Solution {
    public String reverseWords(String s) {
        String[] str = s.split(" ");
         String output = "";
        for(int i=0;i<str.length;i++) {
         output += reverse(str[i]) + " ";
        }
        return output.trim();
    }
    
    public String reverse(String arr) {
        int l = 0;
        int r = arr.length()-1;
        char ch[] = arr.toCharArray();
        while(l<r) {
            char temp = ch[r];
            ch[r] = ch[l];
            ch[l] = temp;
            l++;
            r--;
        }
        String str = String.valueOf(ch);
        return str;
    }
    
}