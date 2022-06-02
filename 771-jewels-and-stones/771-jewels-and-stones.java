class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        
        int sum = 0;
        Map<Character, Integer> hm = new HashMap<>();
        for(int i=0;i<jewels.length();i++) {
            
            hm.put(jewels.charAt(i), 0);            
        }
        
        for(int i=0;i<stones.length();i++) {
            
            if(hm.containsKey(stones.charAt(i))) {
                int count = hm.get(stones.charAt(i));
                hm.put(stones.charAt(i), count+1);
            }
        }
        
        for(int i:hm.values()) {
            sum += i;
        }
        return sum;
        
    }
}