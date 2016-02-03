import java.util.*;

public class Generate_Parentheses {
	void help(int i, int j, List<String> result, StringBuilder temp){
		if(i==0){
			int k=j;
			while(j!=0){temp.append(')');j--;}
			result.add(temp.toString());
			temp.delete(temp.length()-k, temp.length());
			return;
		}
		temp.append('(');
		help(i-1,j,result,temp);
		temp.deleteCharAt(temp.length()-1);
		if(i!=j){
			temp.append(')');
			help(i,j-1,result,temp);
			temp.deleteCharAt(temp.length()-1);			
		}
	}
	
    public List<String> generateParenthesis(int n) {
        List<String> result=new ArrayList<String>();
        StringBuilder temp=new StringBuilder();
        help(n,n,result,temp);
        return result;
    }
}
