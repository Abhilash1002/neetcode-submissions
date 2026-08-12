class MinStack {
    Deque<Integer> st;
    Deque<Integer> minStack;
    public MinStack() {
        this.st = new ArrayDeque<>();
        this.minStack = new ArrayDeque<>();
    }
    
    public void push(int val) {
        st.push(val);
        if(minStack.isEmpty() || minStack.peek() >= val)
            minStack.push(val);
    }
    
    public void pop() {
        int val = st.peek(); st.pop();
        if(val == minStack.peek())
            minStack.pop();
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}
