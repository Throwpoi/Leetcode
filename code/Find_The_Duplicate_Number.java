
public class Find_The_Duplicate_Number {
    public int findDuplicate(int[] nums) {
        int n=nums.length-1;
        int start=1,end=n;
        while(start<end){
            int mid=(start+end)/2;
            int num1=0,num2=0;
            for(int i=0;i<=n;i++){
                if(nums[i]==mid) num1++;
                else if(nums[i]<mid) num2++;
            }
            if(num1>1) return mid;
            else if(num2>mid-1) end=mid-1;
            else start=mid+1;
        }
        return start;
    }
}
