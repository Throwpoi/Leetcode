
public class Search_For_A_Range {
    public int[] searchRange(int[] nums, int target) {
        int start=0,end=nums.length-1,a=-1,b=-1;
        int[] result={-1,-1};
        if(nums[start]>target||nums[end]<target) return result; 
        while(start<=end){
        	int mid=(start+end)/2;
        	if(nums[mid]==target&&(mid==0||nums[mid-1]!=target)){a=mid;break;}
        	else if(nums[mid]<target) start=mid+1;
        	else end=mid-1;
        }
        start=0;end=nums.length-1;
        while(start<=end){
        	int mid=(start+end)/2;
        	if(nums[mid]==target&&(mid==nums.length-1||nums[mid+1]!=target)){b=mid;break;}
        	else if(nums[mid]>target) end=mid-1;
        	else start=mid+1;
        }
        result[0]=a;result[1]=b;
        return result;
    }
}
