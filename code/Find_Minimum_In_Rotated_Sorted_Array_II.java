
public class Find_Minimum_In_Rotated_Sorted_Array_II {
    int help(int[] nums, int start, int end) {
        if(start>end) return Integer.MAX_VALUE;
        if(start==end) return nums[start];
        int mid=(start+end)/2;
        if(nums[mid]>nums[end]) return help(nums,mid+1,end);
        else if(nums[mid]<nums[end]) return Math.min(nums[mid],help(nums,start,mid-1));
        else return Math.min(help(nums,start,mid-1),help(nums,mid+1,end));
    }
    
    public int findMin(int[] nums) {
        return help(nums,0,nums.length-1);
    }
}
