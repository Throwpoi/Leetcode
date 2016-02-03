import java.util.*;

public class Gray_Code {
    public List<Integer> grayCode(int n) {
        List<Integer> result=new ArrayList<Integer>();
        if(n==0){result.add(0);return result;}
        result=grayCode(n-1);
        List<Integer> temp=new ArrayList<Integer>();
        for(int i=result.size()-1;i>=0;i--)
            temp.add(result.get(i)+(int)Math.pow(2,n-1));
        result.addAll(temp);
        return result;
    }
}
