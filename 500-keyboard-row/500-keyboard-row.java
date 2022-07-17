class Solution {
    public String[] findWords(String[] words) {
        String firstRow = "qwertyuiop";
        String secondRow = "asdfghjkl";
        String thirdRow = "zxcvbnm";
        
        String[] output = new String[words.length];
        int low = 0;
        int first = 0;
        int second = 0;
        int third = 0; 
        
        for(int i=0;i<words.length;i++) {
            first = 0;
            second = 0;
            third = 0;
            String word = words[i].toLowerCase();
            
           for(int j=0;j<word.length();j++) {
               if(firstRow.contains(word.charAt(j)+"")) {
                    first++;
               } else if(secondRow.contains(word.charAt(j) + "")) {
                   second++;
               } else {
                   third++;
               }
           }
           if(first == words[i].length() || second == words[i].length() || third == words[i].length()) {
               output[low] = words[i];
               low++;
           } 
        }
        String[] out = new String[low];
        for(int i=0;i<out.length;i++) {
            out[i] = output[i];
        }
        return out;
    }
}