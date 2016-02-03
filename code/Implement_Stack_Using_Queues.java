import java.util.*;

public class Implement_Stack_Using_Queues {
    Queue<Integer> a=new LinkedList<Integer>();
    public void push(int x) {
        Queue<Integer> b=new LinkedList<Integer>();
        b.offer(x);
        while(!a.isEmpty()) b.offer(a.poll());
        a=b;
    }

    // Removes the element on top of the stack.
    public void pop() {
        a.poll();
    }

    // Get the top element.
    public int top() {
        return a.peek();
    }

    // Return whether the stack is empty.
    public boolean empty() {
        return a.isEmpty();
    }
}
