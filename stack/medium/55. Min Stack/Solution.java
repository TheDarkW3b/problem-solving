class MinStack {
    Stack<Long> stack;
    long min;

    public MinStack() {
        stack = new Stack<>();
        min = Integer.MAX_VALUE;
    }
    
    public void push(long val) {
        if(stack.isEmpty()){
            min = val;
            stack.push(val);
        } else {
            if(val <= min){
                stack.push(2 * val - min);
                min = val;
            } else {    
                stack.push(val);
            }
        }
    }
    
    public void pop() {
        if(stack.isEmpty()) return;

        long top = stack.pop();
        if(top <= min){
            min = 2 * min - top;
        }  
    }
    
    public long top() {
        if(stack.isEmpty()) return -1;
        if(stack.peek() <= min) return min;
        return stack.peek();
    }
    
    public long getMin() {
        return min;
    }
}
