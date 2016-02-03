import java.util.*;

public class Factor_Combinations {
    void help(int last, int n, int original, List<Integer> temp, List<List<Integer>> result){
        for(int i=last;i*i<=n;i++){
            if(n%i!=0) continue;
            else{
                int k=n/i;
                temp.add(i);
                help(i,k,original,temp,result);
                temp.remove(temp.size()-1);
            }
        }
        if(n!=original){
        temp.add(n);
        result.add(new ArrayList<Integer>(temp));
        temp.remove(temp.size()-1);
        }
    }
    
    public List<List<Integer>> getFactors(int n) {
        List<Integer> temp=new ArrayList<Integer>();
        List<List<Integer>> result=new ArrayList<List<Integer>>();
        help(2,n,n,temp,result);
        return result;
    }
}
