import java.util.Arrays;

public class Three_Sum_Closest {
    public static int threeSumClosest(int[] nums, int target) {
        int min=Integer.MAX_VALUE;
        int result=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
        	int start=i+1, end=nums.length-1;
        	while(start<end){
        		//if(start>i+1&&nums[start]==nums[start-1]){start++;continue;}
        		//if(end<nums.length-1&&nums[end]==nums[end+1]){end--;continue;}
        		int temp=nums[start]+nums[end]+nums[i];
        		if(temp<target){
        			start++;
        			if(target-temp<min){min=target-temp;result=temp;}
        		}
        		else{
        			end--;
        			if(temp-target<min){min=temp-target;result=temp;}
        		}
        	}
        }
        return result;
    }
    
    public static void main(String[] args){
    	int[] nums={-1,2,1,-4};
    	System.out.println(threeSumClosest(nums,1));
    }
}
