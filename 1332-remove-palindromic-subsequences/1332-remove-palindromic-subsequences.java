class Solution {
    public int removePalindromeSub(String s) {
        if(s=="") return 0;
        if(s.equals(reverse(s))) return 1;
        
        return 2;
    }
    
    public String reverse(String s) {
        char[] ch = s.toCharArray();
        int l = 0;
        int r = ch.length-1;
        while(l<r) {
           char temp = ch[l];
            ch[l] = ch[r];
            ch[r] = temp;
            l++;
            r--;
        }
        System.out.println(String.valueOf(ch));
        return String.valueOf(ch);
    }
}