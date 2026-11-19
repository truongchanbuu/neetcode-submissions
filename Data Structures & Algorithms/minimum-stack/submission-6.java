class Pair {
    int current;
    int min;

    public Pair(int current, int val) {
        this.current = current;
        this.min = val;
    }
}

class MinStack {
    final Deque<Pair> st;
    public MinStack() {
        this.st = new ArrayDeque<>();
    }
    
    public void push(int val) {
        int minVal = val;
        if (!st.isEmpty()) {
            minVal = Math.min(minVal, st.peek().min);
        }
        st.push(new Pair(val, minVal));
    }
    
    public void pop() {
        if (st.isEmpty()) return;
        st.pop();
    }
    
     public int top() {
        return st.peek().current;
    }

    public int getMin() {
        return st.peek().min;
    }
}
