class Solution {
    public List<Integer> partitionLabels(String s) {
        
        int[] alpha = new int[26];
        List<Integer> al = new ArrayList<>();
        for(int i=0;i<s.length();i++) {
            alpha[s.charAt(i) - 'a'] = i;
        }
        
        int start = 0;
        int end = 0;
        
        for(int i=0;i<s.length();i++) {
            end = Math.max(end, alpha[s.charAt(i)-'a']);
            if(i == end) {
                al.add(end-start+1);
                start = end + 1;
            }
        }
        
        return al;
    }
}