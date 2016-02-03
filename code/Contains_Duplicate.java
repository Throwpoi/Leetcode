import java.util.*;

public class Contains_Duplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> a=new HashSet<Integer>();
        for(int i:nums){
            if(a.contains(i)) return true;
            a.add(i);
        }
        return false;
    }
}
