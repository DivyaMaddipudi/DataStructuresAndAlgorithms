class Solution {
    public boolean checkValidString(String s) {
        if(s.length() == 1 && s.charAt(0) == '*') return true;
        if(s.length() == 1)  return false;
        
        Stack<Integer> left = new Stack<>();
        Stack<Integer> star = new Stack<>();
        int count = 0;
        
        for(int i=0;i<s.length();i++) {
            
            
            if(s.charAt(i) == '(') {
                left.push(i);
                // count = stack2.size();
                
            } else if(s.charAt(i) == '*') {
                 star.push(i);
            } else if(s.charAt(i) == ')'){
               if(!left.isEmpty()) {
                   left.pop();
                   // count = stack2.size();
                 
               } else if(!star.isEmpty()) {
                   
                    star.pop();
               } else if(left.isEmpty() && star.isEmpty()) {
                   return false;
               }
            }
            
           
        }
        System.out.println(left);
        System.out.println(star);
        
        while(!star.isEmpty() && !left.isEmpty()) {
            if(left.pop() > star.pop()) return false;
        }
      
        if(!left.isEmpty() && star.isEmpty() ) {
            return false;
        } else {
            return true;
        }
    }
}