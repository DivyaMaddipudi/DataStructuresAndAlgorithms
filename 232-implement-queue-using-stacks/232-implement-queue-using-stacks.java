class MyQueue {

    Stack<Integer> s1;
    Stack<Integer> s2;
    int top;
    public MyQueue() {
        s1 = new Stack<>();
        s2 = new Stack<>();
        top = 0;
    }
    
    public void push(int x) {
        s1.push(x);
        top++;
    }
    
    public int pop() {
       while(s1.size() != 0) {
            s2.push(s1.pop());
       }
        
        int removed = s2.pop();
        
        while(s2.size() != 0) {
            s1.push(s2.pop());
       }
        top--;
        return removed;
    }
    
    public int peek() {
       
        while(s1.size() != 0) {
            s2.push(s1.pop());
       }
        
        int top = s2.peek();
        
          while(s2.size() != 0) {
            s1.push(s2.pop());
       }
        return top;
    }
    
    public boolean empty() {
        System.out.println(s1.size() + " size " + top);
        return top == 0;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */