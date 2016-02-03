import java.util.*;

public class Four_Sum {
    public static List<List<Integer>> fourSum(int[] nums, int target) {
    	List<List<Integer>> result=new ArrayList<List<Integer>>();
    	int length=nums.length;
    	if(length<4) return result;
    	Arrays.sort(nums);
        for(int i=0;i<length-3;i++){
        	if(i>0&&nums[i]==nums[i-1]) continue;
        	int temp=target-nums[i];
        	for(int j=i+1;j<length-2;j++){
        		if(j>i+1&&nums[j]==nums[j-1]) continue;
        		int temp1=temp-nums[j];
        		int start=j+1,end=length-1;
        		while(start<end){
        			if(start>j+1&&nums[start]==nums[start-1]){start++;continue;}
        			if(end<length-1&&nums[end]==nums[end+1]){end--;continue;}
        			int k=nums[start]+nums[end];
        			if(k==temp1) {
        				result.add(Arrays.asList(nums[i],nums[j],nums[start],nums[end]));
        				start++;end--;
        			}
        			else if(k<temp1) start++;
        			else end--;
        		}
        	}
        }
        return result;
    }
    
    public static void main(String[] args){
    	int[] nums={1,0,-1,0,-2,2};
    	System.out.println(fourSum(nums,0));
    }
}
