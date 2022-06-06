class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String, ArrayList<String>> hm = new HashMap<>();
        ArrayList<List<String>> al = new ArrayList<List<String>>();
        ArrayList<String> list1 = new ArrayList<String>();
        
        for(int i=0;i<strs.length;i++) {
            ArrayList<String> list = new ArrayList<>();
            if(hm.containsKey(sort(strs[i]))) {
              list = hm.get(sort(strs[i]));
                // System.out.println( strs[i] + " exists " +  hm.get(sort(strs[i])));
              list.add(strs[i]);
              hm.put(sort(strs[i]), list);
            } else {
                list.add(strs[i]);
                hm.put(sort(strs[i]), list); 
            }       
        }
       
         // Set<Map.Entry<String, ArrayList<String>>> values = hm.entrySet();
         //  for(Map.Entry<String, ArrayList<String>> e:values){
         //        System.out.println(e.getKey() + " : " + e.getValue());
         //    }
        
        for(ArrayList<String> values: hm.values()) {
            System.out.println(values);
            al.add(values);
        }

        return al;
            
    }


//         for(int i=0;i<strs.length;i++) {
//             list1 = new ArrayList<String>();
//             String s1 = sort(strs[i]);
//             if(s1 == "") {
//                  list1.add(strs[i]);
//             } else {
                
//             for(int j=0;j<strs.length;j++) {
//                 if(hm.containsKey(s1)) {
//                     // System.out.println("key exists");
//                     continue;
//                 } else {
//                     String s2 = sort(strs[j]);
//                     // System.out.println(s1 + " i "+ i +" + j " + j + s2);
//                    if(s1.equals(s2)) {
//                         list1.add(strs[j]);
//                    }
                    
//                 }
//             }
//             }
//             hm.put(s1, 0);
//             // list1.add(strs[i]);
//             if(list1.size() != 0) {
//                             al.add(list1);
//             }
//         }
//         return al;
//     }
    
    public String sort(String val) {
        // System.out.println(val + " in sort string");
         char[] arr = val.toCharArray();
         Arrays.sort(arr);
         String strVal = new String(arr);
         // System.out.println(strVal);
         return strVal;
    }
}