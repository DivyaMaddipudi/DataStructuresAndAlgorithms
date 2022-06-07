class Solution {
    public String reverseWords(String s) {
        
        s.trim();
        String[] str = s.split(" ");
        for(int i=0;i<str.length;i++) {
            // System.out.println(str[i]);
        }
      String output =  reverse(str);
        
        
        return output.trim();
    }
    
    public String reverse(String[] arr) {
        int l = 0;
        int r = arr.length-1;
        // System.out.println(arr.length);
        String new_str = "";
        while(l<r) {
        // System.out.println(arr[l]);
        // System.out.println(arr[r]);
            
            
//             if(arr[l] == " " && arr[l+1] == " ") {
//                   l++;
//             } else if(arr[r] == " " && arr[r-1] == " ") {
            
//                r--;
//             } else {
                 String temp = arr[l];
                 arr[l] = arr[r];
                 arr[r] = temp;
                 l++;
                 r--;
            // }
           
        }
         for(int i=0;i<arr.length;i++) {
            System.out.println(arr[i] + i);
             if(arr[i] != "") {
                 new_str += arr[i] + " ";
             } 
        }
        return new_str;
    }
}