class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) return false;
        
        HashMap<Character, Character> sMap = new HashMap<>();
        HashMap<Character, Character> tMap = new HashMap<>();
        
        for(int i=0;i<s.length();i++) {
            if(sMap.containsKey(s.charAt(i))) {
                if(sMap.get(s.charAt(i)) != t.charAt(i)) {
                    return false;
                }
            } else {
                sMap.put(s.charAt(i), t.charAt(i));
            }
        }
        
        for(int i=0;i<s.length();i++) {
           if(tMap.containsKey(t.charAt(i))) {
                if(tMap.get(t.charAt(i)) != s.charAt(i)) {
                    return false;
                }
            } else {
                tMap.put(t.charAt(i), s.charAt(i));
            } 
        }
        return true;
    }
}