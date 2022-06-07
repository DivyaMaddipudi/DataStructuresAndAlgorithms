class Solution {
    public int[] shortestToChar(String s, char c) {
        int finalArray[] = new int[s.length()];
        ArrayList<Integer> al = new ArrayList<>();
        
        for(int i=0;i<s.length();i++) {
            if(s.charAt(i) == c ) {
                al.add(i);
            }
        }
        System.out.println(al);
        
        for(int i=0;i<s.length();i++) {
            int minVal = Integer.MAX_VALUE;
            
            for(int j=0;j<al.size();j++) {
                minVal = Math.min(minVal, Math.abs( al.get(j) - i));
            }
            finalArray[i] = minVal;
            
        }
        
        return finalArray;
    }
}