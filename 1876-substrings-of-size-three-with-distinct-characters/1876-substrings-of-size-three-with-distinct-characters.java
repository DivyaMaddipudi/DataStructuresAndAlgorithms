class Solution {
    public int countGoodSubstrings(String s) {
        
        if(s.length() <= 1) return 0;
        
        HashMap<Character, Integer> hm = new HashMap<>();
        int count = 0;
        String ans = "";
        for(int i=0;i<s.length()-3+1;i++) {
            hm = new HashMap<>();
            for(int j=i;j<i+3;j++) {
                 // System.out.print(s.charAt(j) + " ");
                
                if(!hm.containsKey(s.charAt(j))) {
                System.out.print(s.charAt(j) + " ");
                    
                    hm.put(s.charAt(j), 1);
                    ans += s.charAt(j);
                } else {
                    ans = "";
                    break;
                }
            }
            
            System.out.println();
            
            if(ans != "") {
                count++;
            }
            
        }
        return count;
    }
}