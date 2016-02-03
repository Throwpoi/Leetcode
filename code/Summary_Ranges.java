import java.util.*;

public class Summary_Ranges {
    public List<String> summaryRanges(int[] nums) {
        int i=0,length=nums.length;
        List<String> result=new ArrayList<String>();
        while(i<length){
            int start=i;
            StringBuilder temp=new StringBuilder();
            temp.append(nums[i]);
            while(++i<length&&nums[i]==nums[i-1]+1){}
            if(i-1!=start) temp.append("->"+String.valueOf(nums[i-1]));
            result.add(temp.toString());
        }
        return result;
    }
}
