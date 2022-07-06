class Solution {
    public String findDifferentBinaryString(String[] nums) {
        
        int length = nums[0].length();
        int[] binary = {1, 0, 1};
        
        HashSet<String> set = new HashSet<>();
        
        for(int i=0;i<nums.length;i++) {
            set.add(nums[i]);
        }
        
        ArrayList<String> al = new ArrayList<>();
        helper(binary, length, 0, "", set, al);
        System.out.println(al);
        // System.out.println(ans);
        
        for(int i=0;i<al.size();i++) {
            if(!set.contains(al.get(i))) {
                return al.get(i);
            }
        }
        return "";        
    }
    
    private void helper(int[] binary, int length, int index, String ans,  HashSet<String>  set, ArrayList<String> al) {
        
        
        if(index == binary.length) {
            return;
        }
        
        
         if(ans.length() == length) {
            // System.out.println(ans);
             al.add(ans);
            return;
        }
        
        String temp = ans;
        ans += String.valueOf(binary[index]);
        helper(binary, length, index , ans, set, al);
       
        ans = temp;
        helper(binary, length, index + 1, ans, set, al);
        
        
    }
}