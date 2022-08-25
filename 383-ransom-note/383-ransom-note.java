class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
     
        HashMap<Character, Integer> hm = new HashMap<>();
        for(int i=0;i<ransomNote.length();i++) {
            if(hm.containsKey(ransomNote.charAt(i))) {
                int count = hm.get(ransomNote.charAt(i));
                count++;
                hm.put(ransomNote.charAt(i), count);
            } else {
                hm.put(ransomNote.charAt(i), 1);
            }
        }
        
        for(int i=0;i<magazine.length();i++) {
            if(hm.containsKey(magazine.charAt(i))) {
                int count = hm.get(magazine.charAt(i));
                count--;
                if(count == 0) {
                    hm.remove(magazine.charAt(i));
                } else {
                    hm.put(magazine.charAt(i), count);
                }
            } 
        }
        
        if(hm.size() == 0) {
            return true;
        }
        
        return false;
    }
}