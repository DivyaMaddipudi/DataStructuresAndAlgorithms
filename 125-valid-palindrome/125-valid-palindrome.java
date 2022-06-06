class Solution {
    public boolean isPalindrome(String s) {
        
        HashMap<Character, Integer> hm = new HashMap<>();
        
       String str =  s.toLowerCase();
        for(char i='a'; i<='z';i++) {
            // System.out.println(i);
            hm.put(i, 0);
        }
        
        for(int i=0;i<10;i++) {
            
            char c = (char)(i + '0');
            hm.put(c, 0);
        }
        
        String str2 = "";
        boolean isPalindrome = false;
        
        for(int i=0;i<str.length();i++) {
                                // System.out.println(str.charAt(i) + " str org ");

            if(hm.containsKey(str.charAt(i))) {
                str2 += str.charAt(i);
            }
        }
                    // System.out.println(str2 + " str org ");
                    // System.out.println(reverse(str2));

        if(str2.equals(reverse(str2))) {
           return true;
        } else {
            return false;
        }
        
    }
    
    
    public String reverse(String s1) {
        char[] ch = s1.toCharArray();
        int l=0;
        int r = s1.length()-1;
        while(l<r) {
            char temp = ch[l];
           ch[l] = ch[r];
           ch[r] = temp;
           l++;
           r--;
        }
        
        return String.valueOf(ch);
    }
}