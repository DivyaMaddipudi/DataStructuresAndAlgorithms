class Solution {
    
    ArrayList<String> result;
    public List<String> addOperators(String num, int target) {
        
        result = new ArrayList<String>();
        if(num == null || num.length() == 0) return result;
        helper(num, target, "", 0, 0, 0);
        return result;
    }
    
    private void helper(String num, int target, String path, int index, long sum, long tail) {
        
        if(index == num.length()) {
            if(sum == target) {
                result.add(path);
                return;
            }
        }
        
        
        //logic
        for(int i=index;i<num.length();i++) {
            long curr = Long.parseLong(num.substring(index, i+1));
            if(index != i && num.charAt(index) == '0') continue;
            if(index==0) {
                helper(num, target, path+curr, i + 1, curr, curr);
            } else {
                // +
                helper(num, target, path+ "+" +curr, i + 1, curr+sum, curr);
                helper(num, target, path+ "-" +curr, i + 1, sum-curr, -curr);
                helper(num, target, path+ "*" +curr, i + 1, sum - tail + curr * tail, tail*curr);
            }
        }
    }
}