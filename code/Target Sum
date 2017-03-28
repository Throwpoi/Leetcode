//dynamic programming, knapsack
public class Solution1 {
    public int findTargetSumWays(int[] nums, int S) {
        if(S>1000||S<-1000){
            return 0;
        }
        int[][] dp=new int[nums.length+1][2001];
        dp[0][1000]=1;
        for(int i=1;i<=nums.length;i++){
            for(int j=0;j<=2000;j++){
                dp[i][j]=(j>=nums[i-1]?dp[i-1][j-nums[i-1]]:0)+(j+nums[i-1]<=2000?dp[i-1][j+nums[i-1]]:0);
            }
        }
        return dp[nums.length][1000+S];
    }
}

public class Solution2 {
     public int findTargetSumWays(int[] nums, int S) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        if(S > sum || (sum + S) % 2 == 1)   return 0;
        return subsetSum(nums, (sum + S) / 2);
    }

    private int subsetSum(int[] nums, int S){
        int[] dp = new int[S + 1];
        dp[0] = 1;
        for (int i = 0; i < nums.length; i++) {
            for (int j = S; j >= nums[i]; j--) {
                dp[j] += dp[j - nums[i]];
            }
        }
        return dp[S];
    }
}
