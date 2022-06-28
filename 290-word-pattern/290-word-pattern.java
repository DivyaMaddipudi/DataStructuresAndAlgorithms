class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] str = s.split(" ");
        if(str.length != pattern.length()) return false;
        
        HashMap<Character, String> pat = new HashMap<>();
        HashMap<String, Character> strMap = new HashMap<>();

        for(int i=0;i<pattern.length();i++) {
            String s1 = str[i];
            if(pat.containsKey(pattern.charAt(i))) {
                if(!pat.get(pattern.charAt(i)).equals(s1)) {
                    return false;
                }
            } else {
                pat.put(pattern.charAt(i), s1);
            }
        }
        
         for(int i=0;i<pattern.length();i++) {
            String s1 = str[i];
            if(strMap.containsKey(s1)) {
                if(strMap.get(s1) != pattern.charAt(i)) {
                    return false;
                }
            } else {
                strMap.put(s1, pattern.charAt(i));
            }
        }
        return true;
    }
}