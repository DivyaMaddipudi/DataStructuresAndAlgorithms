class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        
        int size = nums.length-1;
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        List<Integer> al = new ArrayList<Integer>();
        subSet(0, ans, nums, al, size);
        return ans;
    }
    
    public void subSet(int index, List<List<Integer>> ans, int[] nums, List<Integer> al, int size) {
        if(index > size) {
           
            
            Object[] objects = al.toArray();

            Arrays.sort(objects);
          // for(int i=0;i<objects.length;i++) {
          //       System.out.print(objects[i]);
          // }
            List ls = Arrays.asList(objects);
            System.out.println(ls);
            
           if(!ans.contains(ls)) {
               ans.add(new ArrayList<Integer>(ls));
           }
            return;
        }
        al.add(nums[index]);
        subSet(index+1, ans, nums, al, size);
        al.remove(Integer.valueOf(nums[index]));
        subSet(index+1, ans, nums, al, size);
    }
}