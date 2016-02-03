import java.util.*;

public class Ugly_Number_II {
    public int nthUglyNumber(int n) {
        List<Integer> a=new LinkedList<Integer>();
        List<Integer> b=new LinkedList<Integer>();
        List<Integer> c=new LinkedList<Integer>();
        a.add(1);b.add(1);c.add(1);
        int min=1;
        for(int i=0;i<n-1;i++){
            int temp1=a.get(0)*2,temp2=b.get(0)*3,temp3=c.get(0)*5;
            min=Math.min(Math.min(temp1,temp2),temp3);
            a.add(min);b.add(min);c.add(min);
            if(min==temp1) a.remove(0);
            if(min==temp2) b.remove(0);
            if(min==temp3) c.remove(0);
        }
        return min;
    }
}
