
public class Factorial_Trailing_Zeroes {
    public int trailingZeroes(int n) {
        int result=n/5,temp=n/5;
        while(temp!=0){result+=(temp/=5);}
        return result;
    }
}
