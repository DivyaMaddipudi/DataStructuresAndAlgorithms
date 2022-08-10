class MinStack {
    
    Stack<Integer> st1;
    Stack<Integer> minStack;
    int min;
    public MinStack() {
        st1 = new Stack<>();
        minStack = new Stack<>();
        min = Integer.MAX_VALUE;
        minStack.push(min);
    }
    
    public void push(int val) {
        min = Math.min(min, val);
        st1.push(val);
        minStack.push(min);
    }
    
    public void pop() {
        st1.pop();
        minStack.pop();
        min = minStack.peek();
    }
    
    public int top() {
        return st1.peek();
    }
    
    public int getMin() {
        return min;
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