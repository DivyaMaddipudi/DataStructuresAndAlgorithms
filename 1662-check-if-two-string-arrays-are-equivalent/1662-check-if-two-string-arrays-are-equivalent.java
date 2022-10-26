class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String str1 = "";
        String str2 = "";
        for(int i=0;i<word1.length;i++) {
            str1 += word1[i];
        }
         for(int j=0;j<word2.length;j++) {
            str2 += word2[j];
        }
        
        System.out.println(str1 + " " + str2);
        if(str1.equals(str2)) return true;
        return false;
    }
}