import java.util.ArrayList;
import java.util.Stack;

public class MinStack {
    Stack<Integer> minStack;
    Stack<Integer> minAr;
    public MinStack() {
        minStack=new Stack<>();
        minAr=new Stack<>();
    }
    
    public void push(int val) {
        minStack.push(val);
        if(minAr.isEmpty() || val<=minAr.get(minAr.size()-1)) minAr.add(val);
        
    }
    
    public void pop() {
        if(!minStack.isEmpty()){
            int rm=minStack.pop();
            if (rm==minAr.peek()) {
                minAr.pop();
            }
        }
        
    }
    
    public int top() {
        return minStack.peek();
    }
    
    public int getMin() {
        return minAr.peek();
    }
}
