
public class Find_Minimum_In_Rotated_Sorted_Array {
    public int findMin(int[] nums) {
        int start=0,end=nums.length-1;
        if(nums[start]<nums[end]) return nums[start];
        while(start<end){
            int mid=(start+end)/2;
            if(nums[mid]<nums[start]) {
                if(nums[mid-1]>nums[mid]) return nums[mid];
                else end=mid-1;
            }
            else{
                if(nums[mid+1]<nums[mid]) return nums[mid+1];
                else start=mid+1;
            }
        }
        return nums[start];
    }
}
