
public class Power_Of_Two {
    public boolean isPowerOfTwo(int n) {
        int temp=1;
        for(int i=1;i<32;i++){
            if(n==temp) return true;
            else temp<<=1;
        }
        return false;
    }
}
