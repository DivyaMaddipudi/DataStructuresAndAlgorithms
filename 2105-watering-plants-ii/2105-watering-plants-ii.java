class Solution {
    public int minimumRefill(int[] plants, int capacityA, int capacityB) {
        
        int A=0;
        int B=plants.length-1;
        int refill = 0;
        int mid = (A+B)/2;
        int initialCapA = capacityA;
        int initialCapB = capacityB;
        
        while(A<=B) {
            System.out.println("in while");
            if(A!=B) {
            if(plants[A] > capacityA && plants[B] > capacityB) {
            System.out.println("refill");
                                
                refill = refill+2;
                capacityA = initialCapA;
                capacityB = initialCapB;
            } else if(plants[A] > capacityA) {
            System.out.println("refill A");
                
                refill++;
                capacityA = initialCapA;
            } else if(plants[B] > capacityB) {
            System.out.println("refill B");
                
                refill++;
                capacityB = initialCapB;
            }
            
            if(plants[A] < capacityA  && plants[B] < capacityB) {
                capacityA -= plants[A];
                capacityB -= plants[B];
                A++;
                B--;
            } else if(plants[A] < capacityA) {
                capacityA -= plants[A];
                A++;
            } else {
                capacityB -= plants[B];
                B--;
            }
            } else {
            System.out.println(" A==B else");
                
            if(plants[A] > capacityA && plants[B] > capacityB) {
               refill++;
           } else if(plants[A] < capacityA) {
               capacityA -= plants[A];
           } else if(plants[B] < capacityB) {
               capacityB -= plants[B];
           } else {
               capacityA -= plants[A];
           }
            break;
         }
        }
        
        
        // if(plants.length%2 !=0 ) {
        //    if(plants[mid] > capacityA && plants[mid] > capacityB) {
        //        refill++;
        //    } else if(plants[mid] < capacityA) {
        //        capacityA -= plants[A];
        //    } else if(plants[mid] < capacityB) {
        //        capacityB -= plants[B];
        //    } else {
        //        capacityA -= plants[A];
        //    }
        // }
        return refill;
    }
}