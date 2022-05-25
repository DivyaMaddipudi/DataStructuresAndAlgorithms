class Solution {
    public String originalDigits(String s) {
        
        StringBuilder res = new StringBuilder();
        int[] cnt = new int[10];
        for(int i=0;i<s.length();i++) {
            if(s.charAt(i) == 'z') {
                cnt[0] += 1;
            } else if(s.charAt(i) == 'w') {
                cnt[2] += 1;
            }else if(s.charAt(i) == 'u') {
                cnt[4] += 1;
            }else if(s.charAt(i) == 'x') {
                cnt[6] += 1;
            }else if(s.charAt(i) == 'g') {
                cnt[8] += 1;
            } else if(s.charAt(i) == 'o') {
                cnt[1] += 1;           
            }else if(s.charAt(i) == 'h') {
                cnt[3] += 1;
            }else if(s.charAt(i) == 'f') {
                cnt[5] += 1; 
            }else if(s.charAt(i) == 'v') {
                cnt[7] += 1;
            }else if(s.charAt(i) == 'i') {
                cnt[9] += 1;
            }   
        }
        
        cnt[1] = cnt[1] - cnt[0] - cnt[2] - cnt[4];
        cnt[3] = cnt[3] - cnt[8];
        cnt[5] = cnt[5] - cnt[4];
        cnt[7] = cnt[7] - cnt[5];
        cnt[9] = cnt[9] - cnt[5] - cnt[6] - cnt[8];
        
        
         for(int i=0;i<10;i++) {
            while(cnt[i] >= 1) {
                res.append(i);
                cnt[i]--;
            }
        }
        return res.toString();
    }
}
