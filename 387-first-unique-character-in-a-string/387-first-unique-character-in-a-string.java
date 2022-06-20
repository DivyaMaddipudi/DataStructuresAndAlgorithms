class Solution {
    public int firstUniqChar(String s) {
        
        if(s.length() == 1) return 0;
        
        int index = -1;
        for(int i=0;i<s.length();i++) {
            for(int j=0;j<s.length();j++) {
                if(j != i) {
                  if(s.charAt(i) == s.charAt(j)) {
                      index = -1;
                      break;
                  } else {
                    index = i;
                  }
                }
            }
            if(index != -1) {
                return index;
            }
        }
        return index;
    }
}