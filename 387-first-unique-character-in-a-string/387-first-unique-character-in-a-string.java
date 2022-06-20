class Solution {
    public int firstUniqChar(String s) {
        
        //O(N)
        HashMap<Character, List<Integer>> hm = new HashMap<>();
        for(int i=0;i<s.length();i++) {
            if(hm.containsKey(s.charAt(i))) {
                int count = hm.get(s.charAt(i)).get(0);
                count++;
                ArrayList<Integer> list = new ArrayList<>();
                list.add(count);
                list.add(i);
                hm.put(s.charAt(i), list);
            } else {
                ArrayList<Integer> list = new ArrayList<>();
                list.add(1);
                list.add(i);
                hm.put(s.charAt(i), list);
            }
        }
        
      
        for(int j=0;j<s.length();j++) {
            if(hm.containsKey(s.charAt(j))) {
                if(hm.get(s.charAt(j)).get(0) == 1) {
                    return j;
                }
            }
        }
        
        return -1;
        
        // BRUTE FORCE
//         if(s.length() == 1) return 0;
//         int index = -1;
//         for(int i=0;i<s.length();i++) {
//             for(int j=0;j<s.length();j++) {
//                 if(j != i) {
//                   if(s.charAt(i) == s.charAt(j)) {
//                       index = -1;
//                       break;
//                   } else {
//                     index = i;
//                   }
//                 }
//             }
//             if(index != -1) {
//                 return index;
//             }
//         }
//         return index;
    }
}