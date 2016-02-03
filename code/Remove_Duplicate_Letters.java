import java.util.*;

public class Remove_Duplicate_Letters {
	public String removeDuplicateLetters(String s) {
        Map<Character,Integer> a=new HashMap<Character,Integer>();
        Set<Character> b=new HashSet<Character>();
        Stack<Character> c=new Stack<Character>();
        int length=s.length();
        for(int i=0;i<length;i++){
            char temp=s.charAt(i);
            if(!a.containsKey(temp)) a.put(temp,1);
            else a.put(temp,a.get(temp)+1);
        }
        for(int i=0;i<length;i++){
            char temp=s.charAt(i);
            if(b.contains(temp)){a.put(temp,a.get(temp)-1);continue;}
            while(!c.isEmpty()&&c.peek()>temp&&a.get(c.peek())!=0){
                b.remove(c.peek());c.pop();
            }
            c.push(temp);b.add(temp);a.put(temp,a.get(temp)-1);
        }
        StringBuilder result=new StringBuilder();
        while(!c.isEmpty()){result.append(c.pop());}
        return result.reverse().toString();
	}
	
	public static void main(String[] args){
		
	}
}
