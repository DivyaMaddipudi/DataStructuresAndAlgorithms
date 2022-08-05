class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        // TC: O(n)
        // SC: O(1)
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums) {
            if(set.contains(num)) {
                return true;
            }
            set.add(num);
        }
        return false;
    }
}