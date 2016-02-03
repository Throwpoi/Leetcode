import java.util.*;

public class Maximum_Size_Subarray_Sum_Equals_K {
    public int maxSubArrayLen(int[] nums, int k) {
        int length=nums.length;
        int[] add=new int[length+1];
        for(int i=1;i<=length;i++) add[i]=add[i-1]+nums[i-1];
        Map<Integer,Integer> a=new HashMap<Integer,Integer>();
        int max=0;
        for(int i=0;i<=length;i++){
            int temp=add[i];
            if(a.containsKey(temp-k)) max=Math.max(max,i-a.get(temp-k));
            if(!a.containsKey(temp)) a.put(temp,i);
        }
        return max;
    }
}
