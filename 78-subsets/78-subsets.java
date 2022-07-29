class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        
        ArrayList<Integer> al = new ArrayList<>();
        ArrayList<List<Integer>> al1= new ArrayList<List<Integer>>();
        
        int size = nums.length-1;
        subSets(0, al, size, nums, al1);
        return al1;
        
    }
    
    public void subSets(int index, ArrayList<Integer> arr, int size, int[] nums,  ArrayList<List<Integer>> al1) {
        if(index > size) {
            al1.add(new ArrayList<Integer>(arr));
            // System.out.println(al1);
            return;
        }
        arr.add(nums[index]);
        subSets(index+1, arr, size, nums, al1);
        arr.remove(Integer.valueOf(nums[index]));
        subSets(index+1, arr, size, nums, al1);
    }
}