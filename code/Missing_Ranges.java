import java.util.*;

public class Missing_Ranges {
    public List<String> findMissingRanges(int[] nums, int lower, int upper) {
        List<String> result=new ArrayList<String>();
        int length=nums.length;
        if(length==0){
            String temp=String.valueOf(lower);
            if(lower!=upper) temp+=("->"+String.valueOf(upper));
            result.add(temp);
            return result;
        }
        if(nums[0]!=lower){
            String temp=String.valueOf(lower);
            if(nums[0]!=lower+1) temp+=("->"+String.valueOf(nums[0]-1));
            result.add(temp);
        }
        int i=0;
        while(i<length){
            String temp=null;
            while(i<length-1&&nums[i+1]==nums[i]+1){i++;}
            if(i==length-1){
                temp=String.valueOf(upper);
                if(nums[i]==upper) break;
                if(nums[i]!=upper-1) temp=String.valueOf(nums[i]+1)+"->"+temp;
                result.add(temp);
            }
            else{
                temp=String.valueOf(nums[i]+1);
                if(nums[i+1]!=nums[i]+2) temp+=("->"+String.valueOf(nums[i+1]-1));
                result.add(temp);
            }
            i++;
        }
        return result;
        
    }
}
