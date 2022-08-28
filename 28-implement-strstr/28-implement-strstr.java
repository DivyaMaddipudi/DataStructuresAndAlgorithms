class Solution {
    public int strStr(String haystack, String needle) {
        
        if(haystack.length() < needle.length()) return -1;
        
        int i = 0;
        int j = 0;
        
        int index = -1;
        while(i != haystack.length()) {
            if(j == needle.length()) {
                break;
            }
            if(haystack.charAt(i) == needle.charAt(j)) {
                if(index == -1) {
                    index = i;
                }
                i++;
                j++;
            } else if(haystack.charAt(i) != needle.charAt(j) && j!=0) {
                i = index + 1;
                index = -1;
                j = 0;
            } else {
                i++;
            }
        }
        if(i == haystack.length() && (j == 0 || j!=needle.length())) {
            return -1;
        }
        return index;
    }
}