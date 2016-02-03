import java.util.*;

public class Different_Ways_To_Add_Parentheses {
    public List<Integer> diffWaysToCompute(String input) {
        boolean flag=false;
        List<Integer> result=new ArrayList<Integer>();
        for(int i=0;i<input.length();i++){
            char temp=input.charAt(i);
            if(temp=='*'||temp=='+'||temp=='-'){
                flag=true;
                List<Integer> temp1=diffWaysToCompute(input.substring(0,i));
                List<Integer> temp2=diffWaysToCompute(input.substring(i+1));
                if(temp=='*'){
                    for(int a:temp1){
                        for(int b:temp2){
                            result.add(a*b);
                        }
                    }
                }
                else if(temp=='+'){
                    for(int a:temp1){
                        for(int b:temp2){
                            result.add(a+b);
                        }
                    }
                }
                else{
                    for(int a:temp1){
                        for(int b:temp2){
                            result.add(a-b);
                        }
                    }
                }
            }
        }
        if(!flag) result.add(Integer.parseInt(input));
        return result;
    }
}
