import java.util.*;

public class Pascals_Triangle_II {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> result=new ArrayList<Integer>();
        if(rowIndex==0){result.add(1);return result;}
        List<Integer> temp=getRow(rowIndex-1);
        result.add(1);
        for(int i=1;i<temp.size();i++)
            result.add(temp.get(i)+temp.get(i-1));
        result.add(1);
        return result;
    }
}
