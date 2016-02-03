
public class Reverse_Bits {
    public int reverseBits(int n) {
        long result=0;
        for(int i=0;i<32;i++){
            result<<=1;result+=(long)(n&1);n>>=1;
        }
        return (int)result;
    }
}
