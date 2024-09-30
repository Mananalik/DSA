package manan1;

import java.util.Stack;

public class QueueUsingStackRemove {
    private Stack<Integer> first;
    private Stack<Integer> second;
    public void QueueUsingStack(){
        first = new Stack<>();
        second = new Stack<>();
    }
    public void add(int item){
        while (!first.isEmpty()) {
            second.push(first.pop());
        }
        first.push(item);
        while (!second.isEmpty()) {
            first.push(second.pop());
        }
    }
    public int remove() throws Exception {
         return first.pop();
    }
    public int peak() throws Exception {
      return first.peek();
    }
    public boolean isEmpty(){
        return first.isEmpty();
    }
}
