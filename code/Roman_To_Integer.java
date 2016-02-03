
public class Roman_To_Integer {
	static int toNumber(char ch) {  
        switch (ch) {  
            case 'I': return 1;  
            case 'V': return 5;  
            case 'X': return 10;  
            case 'L': return 50;  
            case 'C': return 100;  
            case 'D': return 500;  
            case 'M': return 1000;  
        }  
        return 0;  
    }  
	
	public static int romanToInt(String s) {
		int i=0;
		int num=toNumber(s.charAt(i));
		for(i=1;i<s.length();i++){
			if(toNumber(s.charAt(i))>toNumber(s.charAt(i-1))){
				num+=toNumber(s.charAt(i));num-=2*toNumber(s.charAt(i-1));}
			else num+=toNumber(s.charAt(i));
		}
		return num;
	}
}
