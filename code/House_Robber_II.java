
public class House_Robber_II {
    public int rob(int[] nums) {
        int length=nums.length;
        if(length==0) return 0;
        if(length==1) return nums[0];
        int result=0;
        int[] dp1=new int[length];
        int[] dp2=new int[length];
        dp1[0]=nums[0];
        dp2[0]=0;
        for(int i=1;i<length-1;i++){
            dp1[i]=dp2[i-1]+nums[i];
            dp2[i]=Math.max(dp1[i-1],dp2[i-1]);
        }
        result=Math.max(result,Math.max(dp1[length-2],dp2[length-2]));
        dp1[0]=0;
        dp2[0]=0;
        for(int i=1;i<length-1;i++){
            dp1[i]=dp2[i-1]+nums[i];
            dp2[i]=Math.max(dp1[i-1],dp2[i-1]);
        }
        result=Math.max(result,dp2[length-2]+nums[length-1]);
        return result;
    }
}
