class MyHashSet {
    
    boolean[][] arr;
    int buckets;
    int bucketSize;
    public MyHashSet() {
        buckets = 1000;
        bucketSize = 1000;
        arr = new boolean[buckets][];
    }
    
    public int getBucket(int key) {
        return key%buckets;
    }
    
    public int subBucketsInd(int key) {
        return key/bucketSize;
    }
    
    public void add(int key) {
        
        int firstInd = getBucket(key);
        int secondInd = subBucketsInd(key);
        
        System.out.println(firstInd + " --- " + secondInd);
        
        
        if(arr[firstInd] == null) {
            if(firstInd == 0) {
                arr[firstInd] = new boolean[bucketSize+1];
            } else {
                arr[firstInd] = new boolean[bucketSize];
            }
        }
        arr[firstInd][secondInd] = true;    
    }
    
    public void remove(int key) {
        
        int firstInd = getBucket(key);
        int secondInd = subBucketsInd(key);
        
        if(arr[firstInd] == null) { 
            return;
        }
        
        arr[firstInd][secondInd] = false;
    }
    
    public boolean contains(int key) {
        int firstInd = getBucket(key);
        int secondInd = subBucketsInd(key);
        
         if(arr[firstInd] == null) { 
            return false;
        }
        return arr[firstInd][secondInd];
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */