class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        
        int  j = 0;
        int count = students.length;
        int index = 0;
        int shifts = 0;
        
        int updatedStudents = students.length;
        for(int i=0;i<sandwiches.length;i++) {
            
            if(shifts > count + sandwiches.length + 100) {
                break;
            }
            // System.out.println(i + " " + sandwiches[i]);
            
            if(students[j] == sandwiches[i]) {
                delete(students, updatedStudents);
                System.out.println(students[j] + " ========= " + sandwiches[i]);
                // j++;
                updatedStudents--;
                
                
            } else {
                System.out.println(updatedStudents + " us ");
                
                arrayRotate(students, updatedStudents);
                shifts++;
                i--;
            }
        }
        int left = 0;
        for(int k=0;k<students.length;k++) {
            if(students[k] != -1) {
                left++;
            }
        }
        
        return left;
        
    }
    
    public void arrayRotate(int[] arr, int updatedStudents) {
        int first = arr[0];
        for(int i=1;i<updatedStudents;i++) {
            arr[i-1] = arr[i];
        }
        arr[updatedStudents-1] = first;
        
         for(int j=0;j<arr.length;j++) {
            System.out.print(arr[j] + " ");
        }
        System.out.println();
    }
    
    public void delete(int[] arr, int updatedStudents) {
        
        for(int i=0;i<updatedStudents-1;i++) {
            arr[i] = arr[i+1];
        }
        arr[updatedStudents-1] = -1;
        
         for(int j=0;j<arr.length;j++) {
            System.out.print(arr[j] + " del ");
        }
        System.out.println();
        
    }
}