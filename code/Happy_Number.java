import java.util.*;

public class Happy_Number {
    public boolean isHappy(int n) {
        Set<Integer> a=new HashSet<Integer>();
        while(!a.contains(n)){
            if(n==1) return true;
            a.add(n);int temp=0;
            while(n!=0){temp+=(n%10)*(n%10);n/=10;}
            n=temp;
        }
        return false;
    }
}
