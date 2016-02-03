
public class Find_Peak_Element {
    int help(int[] nums, int start, int end){
        if(start>end) return -1;
        if(start==end){
            if(nums[start]>nums[start-1]&&nums[start]>nums[start+1]) return start;
            else return -1;
        }
        int mid=(start+end)/2;
        if(nums[mid]>nums[mid-1]&&nums[mid]>nums[mid+1]) return mid;
        int a=help(nums,start,mid-1);
        if(a!=-1) return a;
        int b=help(nums,mid+1,end);
        if(b!=-1) return b;
        return -1;
    }
    
    public int findPeakElement(int[] nums) {
        int length=nums.length;
        if(length==1) return 0;
        if(nums[0]>nums[1]) return 0;
        if(nums[length-1]>nums[length-2]) return length-1;
        return help(nums,1,length-2);
    }
}
