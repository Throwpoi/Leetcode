import java.util.*;

public class Three_Sum {
    public static List<List<Integer>> threeSum(int[] nums) {
    	List<List<Integer>> result=new ArrayList<List<Integer>>();
    	if(nums.length<3) return result;
    	Arrays.sort(nums);    //O(nlgn)
    	for(int i=0;i<nums.length-2;i++){
    		if(i>0&&nums[i]==nums[i-1]) continue;
    		int target=-nums[i];
    		int start=i+1,end=nums.length-1;
    		while(start<end){
    			if(start>i+1&&nums[start]==nums[start-1]){start++;continue;}
    			if(end<nums.length-1&&nums[end]==nums[end+1]){end--;continue;}
    			int k=nums[start]+nums[end];
    			if(k==target){
    				result.add(Arrays.asList(nums[i],nums[start],nums[end]));
    				start++;end--;
    			}
    			else if(k>target) end--;
    			else start++;
    		}
    	}
    	return result;
    }
    
    public static void main(String[] args){
    	int[] nums={-2,0,1,1,2};
    	System.out.println(threeSum(nums));
    }
}
