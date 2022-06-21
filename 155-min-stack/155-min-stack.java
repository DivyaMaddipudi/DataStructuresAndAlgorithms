class MinStack {

    Stack<Integer> s;
    Stack<Integer> ms;
    int min = Integer.MAX_VALUE;
    
    public MinStack() {
        ms = new Stack<>();
        s = new Stack<>();
        ms.push(min);
    }
    
    public void push(int val) {
        min = Math.min(min, val);
        ms.push(min);
        s.push(val);
    }
    
    public void pop() {
        s.pop();
        ms.pop();
        min = ms.peek();
    }
    
    public int top() {
        return s.peek();
    }
    
    public int getMin() {
        return ms.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */