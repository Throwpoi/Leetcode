
public class String_To_Integer { 
    public int myAtoi(String str) {
        int i=0, result=0, flag;
        while(i<str.length()&&str.charAt(i)==' ')i++;
        if(i==str.length()) return 0;
        if(str.charAt(i)=='+'||str.charAt(i)=='-'){flag=(str.charAt(i)=='+')?1:-1;i++;}
        else if(str.charAt(i)<='9'&&str.charAt(i)>='0') flag=1;
        else return 0;
        while(i<str.length()){
        	char temp=str.charAt(i);
        	if(temp<'0'||temp>'9') break;
        	if(result>Integer.MAX_VALUE/10) return Integer.MAX_VALUE;
        	if(result<Integer.MIN_VALUE/10) return Integer.MIN_VALUE;
        	result*=10;int k=(temp-'0')*flag;
        	if(k>0&&result>Integer.MAX_VALUE-k) return Integer.MAX_VALUE;
        	if(k<0&&result<Integer.MIN_VALUE-k) return Integer.MIN_VALUE;
        	result+=k;i++;
        }
        return result;    
    }
}
