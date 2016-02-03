
public class Search_In_Rotated_Sorted_Array_II {
    boolean help(int[] nums, int target, int start, int end){
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target) return true;
            else if(nums[start]>nums[mid]){
                if(target>nums[mid]&&target<=nums[end]) start=mid+1;
                else end=mid-1;
            }
            else if(nums[start]<nums[mid]){
                if(target<nums[mid]&&target>=nums[start]) end=mid-1;
                else start=mid+1;
            }
            else return help(nums,target,start,mid-1)||help(nums,target,mid+1,end);
        }
        return false;
    }
    
    public boolean search(int[] nums, int target) {
        return help(nums,target,0,nums.length-1);
    }
}
