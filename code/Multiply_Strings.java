
public class Multiply_Strings {
    public String multiply(String num1, String num2) {
    	int length=num1.length()+num2.length();
    	int[] result=new int[length];
    	for(int i=num2.length()-1;i>=0;i--){
    		for(int j=num1.length()-1;j>=0;j--){
    			int a=num1.charAt(j)-'0',b=num2.charAt(i)-'0';
    			int temp=result[i+j+1]+a*b;
    			result[i+j+1]=temp%10;
    			result[i+j]+=temp/10;
    			
    		}
    	}
    	String output="";
    	int start=0;
    	while(start<length-1&&result[start]==0) start++;
    	while(start<length)
    		output=output+result[start++];
    	return output;
    }
}
