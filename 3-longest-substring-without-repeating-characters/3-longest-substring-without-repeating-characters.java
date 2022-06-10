class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        if(s.equals("") ) return 0;
        
        if(s.length() == 1) return 1;
        
//         for(int i=0;i<25;i++) {
            
//         }
        
        int maxlength = Integer.MIN_VALUE;
        int currentLength = 0;
        ArrayList<Character> al = new ArrayList<>();
        int slow = 0;
        int fast = 0;
        while(fast < s.length() && slow < s.length()) {
            if(al.contains(s.charAt(fast))) {
                currentLength = al.size();
                al.remove(Character.valueOf(s.charAt(slow)));
                slow++;
            } else {
                al.add(s.charAt(fast));
                fast++;
            }
            if(al.size() > maxlength) {
                maxlength = al.size();
            }
        }
        return maxlength;
    }
}