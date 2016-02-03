
public class Palindrome_Number {
    public boolean isPalindrome(int x) {
        int z=x,y=0;
        if(x<0) return false;
        while(z!=0){
        	if(y>Integer.MAX_VALUE/10) return false;
        	y*=10;
        	if(y>Integer.MAX_VALUE-z%10) return false;
        	y+=z%10;z/=10;
        }
        return y==x;
    }
}
