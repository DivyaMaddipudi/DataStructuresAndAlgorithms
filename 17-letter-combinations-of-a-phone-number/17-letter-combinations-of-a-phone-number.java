class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        
        if(digits == null || digits.length() == 0) return ans;
        
        String[] map = new String[10];
        map[2] = "abc";
        map[3] = "def";
        map[4] = "ghi";
        map[5] = "jkl";
        map[6] = "mno";
        map[7] = "pqrs";
        map[8] = "tuv";
        map[9] = "wxyz";
        backtrack(ans, digits, "", 0, map);
        return ans;
    }
    
    public void backtrack( List<String> ans, String digits, String currStr, int index, String[] map) {
        if(index == digits.length()) {
            ans.add(currStr);
            return;
        }
        String letters = map[digits.charAt(index)-'0'];
        for(int i=0;i<letters.length();i++) {
            backtrack(ans, digits, currStr+letters.charAt(i), index+1, map);
        }
    }
    
}