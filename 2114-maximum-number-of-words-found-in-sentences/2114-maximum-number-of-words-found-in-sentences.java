class Solution {
    public int mostWordsFound(String[] sentences) {
        int max =Integer.MIN_VALUE;
        for(int i=0;i<sentences.length;i++) {
            String[] str = sentences[i].split(" ");
            
            max = Math.max(str.length, max);
        }
        return max;
    }
}