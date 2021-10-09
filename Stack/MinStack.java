import java.util.*;

class MinStack {

    /** initialize your data structure here. */
    ArrayList<Integer> dataStruc;
    public MinStack() {
       dataStruc = new ArrayList<>();
    }
    
    public void push(int val) {
        dataStruc.add(val);
    }
    
    public void pop() {
        dataStruc.remove(dataStruc.size()-1); 
    }
    
    public int top() {
        return dataStruc.get(dataStruc.size()-1);
        
    }
    
    public int getMin() {
        Iterator<Integer> in = dataStruc.iterator();
        int min = (int)Math.pow(2, 31);
        while(in.hasNext()){
            int val = in.next();
            if(val <= min){
                min=val;
            }
        }
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