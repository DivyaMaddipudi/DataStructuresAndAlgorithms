class Solution {
    public int minimumLengthEncoding(String[] words) {
        
        String ans = "";
        String max = "";
        
        for(int i=0;i<words.length-1;i++) {
            for(int j=i+1;j<words.length;j++) {
                if(words[i].length() < words[j].length() ) {
                    String temp = words[i];
                    words[i] = words[j];
                    words[j] = temp;
                }
            }
        }
        
        
        for(int i=0;i<words.length;i++) {
                System.out.println(words[i]);
            
            // if(words[i].length() == 1) {
            //     int index = ans.lastIndexOf(words[i]);
            //     int length = index + words[i].length();
            //     System.out.println(index + " -------- " + length);
            //     if(ans == "") {
            //         ans += words[i] + "#";
            //     } else if(ans.charAt(length) != '#') {
            //         ans += words[i]+"#";
            //     }
            // } else {
            
            if(!ans.contains(words[i]+"#")) {
                // int index = ans.indexOf(words[i]);
                // int length = index + words[i].length();
                // System.out.println(index + " -------- " + length);
                // if(ans.charAt(length) != '#') {
                //     ans += words[i]+"#";
                // }
                 ans += words[i]+"#";
                
            } 
            }
        // }
        System.out.println(ans);
        return ans.length();
    }
}