public class Bitwise_AND_Of_Numbers_Range {
    int help(int m, int n){
        if(m==0||n==0) return 0;
        int temp1=m,temp2=n;
        int a=0,b=0;
        while(temp1!=1){a++;temp1>>=1;}
        while(temp2!=1){b++;temp2>>=1;}
        if(a!=b) return 0;
        int temp=(1<<a);
        return temp+help(m-temp,n-temp);
    }
    
    public int rangeBitwiseAnd(int m, int n) {
        return help(m,n);
    }
}
