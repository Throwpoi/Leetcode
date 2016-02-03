import java.util.*;

public class Valid_Parentheses {
    public boolean isValid(String s) {
        Stack<Character> a=new Stack<Character>();
        int i=0;
        while(i<s.length()){
        	char temp=s.charAt(i);
        	if(temp=='('||temp=='['||temp=='{') a.add(temp);
        	else{
        		if(a.isEmpty()) return false;
        		else{
        			if((temp==')'&&a.peek()=='(')||
        					(temp==']'&&a.peek()=='[')||
        					(temp=='}'&&a.peek()=='{'))
        				a.pop();
        			else a.add(temp);
        		}
        	}
        	i++;
        }
        return a.isEmpty();
    }
}
