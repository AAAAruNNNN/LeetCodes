package Design;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class MinStack {
    List<Integer> list;
    Stack<Integer> minStack;

    /** initialize your data structure here. */
    public MinStack() {
        minStack = new Stack<Integer>();
        list = new ArrayList<Integer>();
    }
    
    public void push(int x) {
        minStack.push(x);    
        list.add(x);
        Collections.sort(list);
    }
    
    public void pop() {
        int x = minStack.pop();
        list.remove(new Integer(x));
    }
    
    public int top() {
        return minStack.peek();
    }
    
    public int getMin() {
        return list.get(0);
    }


/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
    public static void main(String args[]) {
    	MinStack obj = new MinStack();
    	obj.push(-1);
    	obj.push(0);
    	obj.push(-2);
    	obj.pop();
    	System.out.println(obj.getMin());
    }
}
