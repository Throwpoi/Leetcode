
public class Number_Of_Digit_One {
    public int countDigitOne(int n) {
        long result=0,k=1;
        while(k<=n){
            long a=n/k, b=n%k;
            result+=(a+8)/10*k+((a%10==1)?(b+1):0);
            k*=10;
        }
        return (int)result;
    }
}
