
public class Minimum_Size_Subarray_Sum {
    public int minSubArrayLen(int s, int[] nums) {
        int i=0,j=0,min=Integer.MAX_VALUE;
        int temp=0,length=0,l=nums.length;
        while(j<l){
            while(j<l&&temp<s){temp+=nums[j++];length++;}
            while(temp>=s){temp-=nums[i++];length--;}
            min=Math.min(min,length+1);
        }
        if(i==0&&temp<s) return 0;
        else return min;
    }
}
