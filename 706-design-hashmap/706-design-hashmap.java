class MyHashMap {
    
    public class Node {
        int key;
        int value;
        Node next;
        
        public Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }
    
  
    
    Node[] nodes;
    int buckets;
    public MyHashMap() {
        buckets = 1000;
        nodes = new Node[buckets];
    }
    
    public int getPriSize(int key) {
        return key%buckets;
    }
    
    public Node find(Node head, int key) {
        Node prev = head;
        Node curr = head.next;
        while(curr != null && curr.key != key) {
            prev = curr;
            curr = curr.next;
        }
        return prev;
    }
    public void put(int key, int value) {
        int firstIndex = getPriSize(key);
        if(nodes[firstIndex] == null) {
            nodes[firstIndex] = new Node(-1, -1);
        } 
        Node prev = find(nodes[firstIndex], key);
        if(prev.next == null) {
            prev.next = new Node(key, value);
        } else {
            prev.next.value = value;
        }
       
    }
    
    public int get(int key) {
        int firstIndex = getPriSize(key);
        if(nodes[firstIndex] == null) {
           return -1;
        }
        Node prev = find(nodes[firstIndex], key);
        if(prev.next == null) {
            return -1;
        }
        return prev.next.value;
    }
    
    public void remove(int key) {
        int firstIndex = getPriSize(key);
        if(nodes[firstIndex] == null) {
            return;
        }
        Node prev = find(nodes[firstIndex], key);
        
        if(prev.next != null) {
            prev.next = prev.next.next;
        }
        
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */