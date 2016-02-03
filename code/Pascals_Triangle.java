import java.util.*;

public class Pascals_Triangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result=new ArrayList<List<Integer>>();
        if(numRows==0) return result;
        List<Integer> temp=new ArrayList<Integer>();
        if(numRows==1){
            temp.add(1);result.add(new ArrayList<Integer>(temp));
            return result;
        }
        result=generate(numRows-1);
        List<Integer> a=result.get(result.size()-1);
        temp.add(1);
        for(int i=1;i<a.size();i++)
            temp.add(a.get(i)+a.get(i-1));
        temp.add(1);result.add(new ArrayList<Integer>(temp));
        return result;
    }
}
