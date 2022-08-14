class Solution {
    public int romanToInt(String s) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("I", 1);
        hm.put("II", 2);
        hm.put("III", 3);
        hm.put("IV", 4);
        hm.put("V", 5);
        hm.put("VI", 6);
        hm.put("VII", 7);
        hm.put("VIII", 8);
        hm.put("IX", 9);
        hm.put("X", 10);
        hm.put("XL", 40);
        hm.put("L", 50);
        hm.put("XC", 90);
        hm.put("C", 100);
        hm.put("CD", 400);
        hm.put("D", 500);
        hm.put("CM", 900);
        hm.put("M", 1000);
        
        if(hm.containsKey(s)) return hm.get(s);
        int res = 0;
        for(int i=0;i<s.length();i++) {
            String roman = "";
            roman += s.charAt(i);
            if(i < s.length() -1 && s.charAt(i) == 'C') {
                if(s.charAt(i+1) == 'D') {
                    roman += s.charAt(i + 1);
                    i++;
                } else if(s.charAt(i+1) == 'M') {
                    roman += s.charAt(i + 1);
                    i++;
                }
                
            } else if(i < s.length() -1 && s.charAt(i) == 'X') {
                if(s.charAt(i+1) == 'L') {
                    roman += s.charAt(i + 1);
                     i++;
                    
                } else if(s.charAt(i+1) == 'C') {
                    roman += s.charAt(i + 1);
                    i++;
                    
                }
                
                System.out.println(roman + " IN x" + i);
                
            } else if(i < s.length() -1 && s.charAt(i) == 'I') {
                if(s.charAt(i+1) == 'X') {
                    roman += s.charAt(i + 1);
                    i++;
                    
                } else if(s.charAt(i+1) == 'V') {
                    roman += s.charAt(i + 1);
                    i++;
                    
                }
            } 
            res += hm.get(roman);
        }
        return res;
    }
}