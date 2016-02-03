
public class Longest_Increasing_Subsequence {
    int BinarySearch(int[] nums, int start, int end, int target){
        while(start<=end){
            int mid=(start+end)/2;
            int temp=nums[mid];
            if(temp==target) return mid;
            else if(temp<target) start=mid+1;
            else end=mid-1;
        }
        return start;
    }
    
    public int lengthOfLIS(int[] nums) {
        int max=0,length=nums.length;
        if(length==0) return 0;
        int[] temp=new int[length];
        int start=0,end=0;
        temp[0]=nums[0];
        for(int i=1;i<length;i++){
            int k=nums[i];
            int index=BinarySearch(temp,start,end,k);
            max=Math.max(end-start+1,max);
            if(index==end+1) end++;
            temp[index]=k;
        }
        max=Math.max(end-start+1,max);
        return max;
    }
}
