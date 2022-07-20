class Solution {
    public int mostWordsFound(String[] sentences) {
        int max =Integer.MIN_VALUE;
        for(int i=0;i<sentences.length;i++) {
            max = Math.max(sentences[i].split(" ").length, max);
        }
        return max;
    }
}