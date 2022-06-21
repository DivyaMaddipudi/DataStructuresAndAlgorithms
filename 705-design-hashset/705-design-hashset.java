class MyHashSet {
    
    boolean[][] container;
    int bucket;
    int bucketItems;

    public MyHashSet() {
        bucket = 1000;
        bucketItems = 1000;
        container = new boolean[bucket][];
    }
    
    public int getHash(int key) {
        return key%bucket;
    }
    
    
    public int getSecondHash(int key) {
        return key/bucketItems;
    }
    
    public void add(int key) {
        
        int index = getHash(key);
        int sIndex = getSecondHash(key);
        
        if(container[index] == null) {
        // System.out.println(index + " =============== ");
            
             if(index == 0) {
                 container[index] = new boolean[bucketItems+1];
             }  else {
                 
                 container[index] = new boolean[bucketItems];
                 // System.out.println(index + " =============== " + container[index].length);
                 
             }
        }
        container[index][sIndex] = true;
    }
    
    public void remove(int key) {
         int index = getHash(key);
         int secondindex = getSecondHash(key);
        if(container[index] == null) {
            return;
        }
         container[index][secondindex] = false;
    }
    
    public boolean contains(int key) {
        int index = getHash(key);
        int secondindex = getSecondHash(key);
        if(container[index] != null) {
            return container[index][secondindex];
        } else {
            return false;
        }
        // return true;
        
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */