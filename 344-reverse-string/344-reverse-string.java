class Solution {
    public void reverseString(char[] s) {
        
        
        String str = printRev(s);
        char[] st = str.toCharArray();
        for(int i=0;i<s.length;i++) {
            s[i] = st[i];
        }
        System.out.println(s);
        
        // TWO POINTER
       //  int l=0;
       //  int r = s.length-1;
       //  while(l<r) {
       //      char temp = s[l];
       //      s[l] = s[r];
       //      s[r] = temp;
       //      l++;
       //      r--;
       //  }
       // for(int i=0;i<s.length;i++) {
       //      System.out.println(s[i]);
       // }
    }
    
    public String printRev(char[] s) {
        if(s.length == 0) {
            return "";       
        }
        
        if(s.length == 1) {
            return new String(s);
        }
        
        //RECURSION
        char temp = s[s.length - 1];
        char first = s[s.length-1];
        char last = s[0];
        System.out.println(s.length);
        char[] arr2 = Arrays.copyOfRange(s,1,s.length-1);
       
        // String str = first + last;
        return first + printRev(arr2) + last;   
    }
}