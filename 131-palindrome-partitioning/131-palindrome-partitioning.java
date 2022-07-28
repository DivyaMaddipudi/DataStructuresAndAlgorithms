class Solution {
    
    ArrayList<List<String>> result;
    public List<List<String>> partition(String s) {
        result = new ArrayList<List<String>>();
        if(s.length() == 0 || s == null) return result;
        helper(0, new ArrayList<>(), s);
        
        return result;
    }
    
    private void helper(int index, ArrayList<String> path, String s) {
        //base case
        if(index == s.length()) {
            System.out.println(path + " in base cdn ");
            for(int i=0;i<path.size();i++) {
                if(!isPalindrome(path.get(i))) {
                    return;
                }
            }
            result.add(new ArrayList<>(path));
            return;
        }
        // logic 
        for(int i=index;i<s.length();i++) {
            String str = s.substring(index, i+1);
            
            //RECURSION
            // ArrayList<String> newlist = new ArrayList<>(path);
            // newlist.add(str);
            
            path.add(str);
            // System.out.println(path);
            helper(i+1, path, s);
            
            path.remove(path.size()-1);
        }
    }
    
    private boolean isPalindrome(String s) {
        if(s.length() == 1) return true;
        int low = 0;
        int high = s.length()-1;
        while(low <= high) {
            if(s.charAt(low) == s.charAt(high)) {
                low++;
                high--;
            } else {
                return false;
            }
        }
        return true;
    }
}