import java.util.*;

public class Two_Sum {
    public int[] twoSum(int[] nums, int target) {
    	int[] result=new int[2];
        Map<Integer, Integer> a=new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
        	int temp=target-nums[i];
        	if(a.containsKey(temp)){
        		result[0]=a.get(temp)+1;
        		result[1]=i+1;
        		break;
        	}
        	else a.put(nums[i], i);
        }
        return result;
    }
}
