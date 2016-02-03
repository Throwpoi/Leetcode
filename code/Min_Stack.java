import java.util.*;

class Node3{
    int val=0;
    int min=0;
    public Node3(int val, int min){this.val=val;this.min=min;}
}

public class Min_Stack {
    Stack<Node3> a=new Stack<Node3>();
    public void push(int x) {
        if(a.isEmpty()){Node3 temp=new Node3(x,x);a.push(temp);}
        else {Node3 temp=new Node3(x,Math.min(a.peek().min,x));a.push(temp);}
    }

    public void pop() {
        a.pop();
    }

    public int top() {
        return a.peek().val;
    }

    public int getMin() {
        return a.peek().min;
    }
}
