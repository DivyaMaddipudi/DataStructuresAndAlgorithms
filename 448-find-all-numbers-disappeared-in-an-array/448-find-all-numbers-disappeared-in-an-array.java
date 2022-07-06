class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        
        HashSet<Integer> set = new HashSet<>();
         for(int i=0;i<nums.length;i++) {
            set.add(nums[i]);
        }
        
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=1;i<nums.length+1;i++) {
            if(!set.contains(i)) {
                al.add(i);
            } 
        }
        return al;
    }
}