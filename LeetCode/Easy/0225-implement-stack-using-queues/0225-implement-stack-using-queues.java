class MyStack {
    Queue<Integer> q;

    public MyStack() {
        q=new LinkedList<>();
    }
    
    public void push(int x) {

        q.offer(x);


    }
    
    public int pop() {
            Queue<Integer> temp = new LinkedList<>();

        while (q.size() > 1) {
            temp.offer(q.poll());
        }

        int ans = q.poll();
        q = temp;

        return ans;
        
    }
    
 
public int top() {
    Queue<Integer> temp = new LinkedList<>();

    while (q.size() > 1) {
        temp.offer(q.poll());
    }

    int ans = q.peek();
    temp.offer(q.poll());

    q = temp;
    return ans;
}

    
    public boolean empty() {
        if(q.isEmpty()){
            return true;
        }
        return false;
        
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */