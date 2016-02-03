import java.util.*;

public class Count_And_Say {
	static String nextString(String a){
		int b=0,c=0;
		String result="";
		for(int i=0;i<a.length();i++){
			int temp=a.charAt(i)-'0';
			if(c!=temp){
				result+=(b+""+c);
				c=temp;b=1;
			}
			else b++;
		}
		result+=(b+""+c);
		return result.substring(2);
	}
	
    public static String countAndSay(int n) {
        if(n==1) return "1";
        else return nextString(countAndSay(n-1));
    }
	
	public static void main(String[] args){
		System.out.println(countAndSay(4));
	}
}
