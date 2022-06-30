class Solution {
    public int convertTime(String current, String correct) {
        
        int arr[] = new int[] {1, 5, 15, 60};
        int currentInMins = 0;
        int correctInMinutes = 0;
        String[] currentArray = current.split(":");
        String[] correctArray = correct.split(":");
        
        currentInMins = Integer.valueOf(currentArray[0])*60 + Integer.valueOf(currentArray[1]);
        correctInMinutes = Integer.valueOf(correctArray[0])*60 + Integer.valueOf(correctArray[1]);
        

        int diff =  correctInMinutes - currentInMins;
        
        int count = 0;
        while(diff > 0) {
            diff -= findHighest(diff, arr);
            count++;
        }
        return count;
    }
    
    private int findHighest(int target, int[] arr) {
        int low = 0;
        int high = arr.length - 1;
        
        while(low <= high) {
            int mid = low + (high - low)/2;
            
            if(arr[mid] == target) {
                return arr[mid];
            }
            if(target < arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
       return arr[high];
    }
}