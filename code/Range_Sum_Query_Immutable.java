
public class Range_Sum_Query_Immutable {
    int[] dp;
    public Range_Sum_Query_Immutable(int[] nums) {
        int length=nums.length;
        dp=new int[length+1];
        for(int i=1;i<=length;i++) dp[i]=dp[i-1]+nums[i-1];
    }

    public int sumRange(int i, int j) {
        return dp[j+1]-dp[i];
    }
}
