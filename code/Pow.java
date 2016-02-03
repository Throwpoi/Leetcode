
public class Pow {
    public double myPow(double x, int n) {
        if(n==0) return 1;
        else if(n>0){
            if(n==1) return x;
            double k=myPow(x,n/2);
            if(n%2==0) return k*k;
            else return k*k*x;
        }
        else{
            if(n==-1) return 1/x;
            double k=myPow(x,-n/2);
            if(n%2==0) return 1/(k*k);
            else return 1/(k*k*x);            
        }
    }
}
