class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> ans = new ArrayList<Integer>();
        
        for(int i=0;i<nums1.length;i++) {
            for(int j=0;j<nums2.length;j++) {
                if(nums1[i] == nums2[j]) {
                    if(!ans.contains(nums1[i])) {
                         ans.add(nums1[i]);
                    }
                }
            }
        }
        
        // System.out.println(ans.toArray());
        int[] arr = new int[ans.size()];
        for(int i=0;i<arr.length;i++) {
            arr[i] = ans.get(i);
        }
        return arr;
        
    }
}