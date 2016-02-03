
public class Divide_Two_Integers {
    public static int divide(int dividend, int divisor) {
    	if(dividend==0) return 0;
    	if(dividend==Integer.MIN_VALUE&&divisor==-1) return Integer.MAX_VALUE;
    	boolean flag=true;
    	int result=0;
    	if(dividend<0&&divisor>0){flag=false;divisor=-divisor;}
    	else if(dividend>0&&divisor<0){flag=false;dividend=-dividend;}
    	else if(dividend>0&&divisor>0){dividend=-dividend;divisor=-divisor;}
    	while(dividend<=divisor){
    		int temp1=divisor,temp2=1;
    		while(temp1>Integer.MIN_VALUE/2&&dividend<=temp1<<1){
    			temp1<<=1;temp2<<=1;
    		}
    		result+=temp2;
    		dividend-=temp1;
    	}
    	return flag?result:-result;
    }
    
    public static void main(String[] args){
    	System.out.println(divide(2147483647,1));
    }
}
