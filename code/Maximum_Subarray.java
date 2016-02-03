
public class Maximum_Subarray {
    public int maxSubArray(int[] nums) {
        int max=nums[0],k=nums[0];
        for(int i=1;i<nums.length;i++){
            k=k>0?(nums[i]+k):nums[i];
            max=Math.max(max,k);
        }
        return max;
    }
    
    int help(int[] nums, int start, int end){
        if(start>end) return Integer.MIN_VALUE;
        int mid=(start+end)/2;
        int i=mid-1,j=mid+1;
        int temp1=0,temp2=0,max1=0,max2=0;
        while(i>=start){temp1+=nums[i--];max1=Math.max(max1,temp1);}
        while(j<=end){temp2+=nums[j++];max2=Math.max(max2,temp2);}
        return Math.max(nums[mid]+max1+max2,Math.max(help(nums,start,mid-1),help(nums,mid+1,end)));
    }
    
    public int maxSubArray1(int[] nums) {  //divide and conquer
        return help(nums,0,nums.length-1);
    }
}
