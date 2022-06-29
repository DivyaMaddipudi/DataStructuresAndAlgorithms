class Solution {
    public int longestPalindrome(String s) {
        
        HashMap<Character, Integer> hm = new HashMap<>();
        int count = 0;
        for(int i=0;i<s.length();i++) {
            if(hm.containsKey(s.charAt(i))) {
                System.out.println(" hello ");
                int value = hm.get(s.charAt(i));
                value++;
                hm.put(s.charAt(i), value);
            } else {
                System.out.println(" checking else ");
                
                hm.put(s.charAt(i), 1);
            } 
        }
                System.out.println(hm);
        
        
        for(int j=0;j<s.length();j++) {
            
                if(hm.containsKey(s.charAt(j))) {
                    if(hm.get(s.charAt(j))%2 == 0) {
                        count+= hm.get(s.charAt(j));
                        hm.remove(s.charAt(j));
                    } else {
                        count+= hm.get(s.charAt(j))-1;
                        hm.put(s.charAt(j), 1);
                    }
                }
            
        }
        
        if(hm.size() != 0) {
            count++;
        }
        
        return count;
    }
}