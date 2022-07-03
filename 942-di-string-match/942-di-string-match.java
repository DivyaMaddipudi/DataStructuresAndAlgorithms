class Solution {
    public int[] diStringMatch(String s) {
        int[] ar = new int[s.length()+1];
        for(int i=0;i<ar.length;i++) {
            ar[i]=i;
        }
        
        int[] ans = new int[s.length()+1];
        System.out.println(Arrays.toString(ar));
        int start = 0;
        int end = ar.length - 1;
        for(int j=0;j<s.length();j++) {
            if(s.charAt(j) == 'I') {
                ans[j] =  ar[start];
                start++;
            } else {
                ans[j] = ar[end];
                end--;
            }
        }
        ans[ans.length -1] = ar[end];
        return ans;
    }
}