class Solution {
    String tilesStr;
    boolean[] vis;
    HashSet<String> result;
    String str = "";
    public int numTilePossibilities(String tiles) {
        
        vis = new boolean[tiles.length()];
        tilesStr = tiles;
        result = new HashSet<>();
        helper(0, new ArrayList<>(), vis);
        // System.out.println(result);
        return result.size();
    }
    
    private void helper(int index, List<Character> al, boolean[] vis) {
        
        
        //logic
        for(int i=0;i<tilesStr.length();i++) {
            if(vis[i] == false) {
                vis[i] = true;
                str+=tilesStr.charAt(i);
                result.add(str);
                helper(index, al, vis);
                vis[i] = false;
                str = str.substring(0,str.length()-1);
            }
        }
    
    }
    
}