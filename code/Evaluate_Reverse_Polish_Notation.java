import java.util.*;

public class Evaluate_Reverse_Polish_Notation {
    public static int evalRPN(String[] tokens) {
        Stack<String> a=new Stack<String>();
        for(int i=0;i<tokens.length;i++){
            String temp=tokens[i];
            if(temp.equals("+")||temp.equals("-")||temp.equals("*")||temp.equals("/")){
                int num1=Integer.parseInt(a.pop()),num2=Integer.parseInt(a.pop());
                switch(temp){
                    case("+"):a.push(String.valueOf(num2+num1));break;
                    case("-"):a.push(String.valueOf(num2-num1));break;
                    case("*"):a.push(String.valueOf(num2*num1));break;
                    case("/"):a.push(String.valueOf(num2/num1));break;
                }
            }
            else a.push(temp);
        }
        return Integer.parseInt(a.pop());
    }
    
    public static void main(String[] args){
    	String[] tokens={"4","-2","/","2","-3","-","-"};
    	evalRPN(tokens);
    }
}
