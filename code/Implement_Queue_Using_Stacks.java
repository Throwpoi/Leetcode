import java.util.*;

public class Implement_Queue_Using_Stacks {
    Stack<Integer> a=new Stack<Integer>();
    public void push(int x) {
        Stack<Integer> b=new Stack<Integer>();
        while(!a.isEmpty()){b.push(a.pop());}
        a.push(x);
        while(!b.isEmpty()){a.push(b.pop());}
    }

    // Removes the element from in front of queue.
    public void pop() {
        a.pop();
    }

    // Get the front element.
    public int peek() {
        return a.peek();
    }

    // Return whether the queue is empty.
    public boolean empty() {
        return a.isEmpty();
    }
}
