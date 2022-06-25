class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
     
        int low = 0;
        int high = letters.length -1;
        
        // int mid = low + (high - low)/2;

        while(low <= high) {
            int mid = low + (high - low)/2;
            if(target >= letters[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        
        System.out.println(low + " " + high);
        
        if(low == letters.length) {
            return letters[0];
        } else {
            return letters[low];
        }
    }
}