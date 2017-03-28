public class Solution1 {
    /*
      
    */
    public boolean canPartition(int[] nums) {
        int sum=0;
        for(int i:nums){
            sum+=i;
        }
        if(sum==0||sum%2!=0){
            return false;
        }
        int length=nums.length, target=sum/2;
        boolean[] dp=new boolean[target+1];
        dp[0]=true;
        for(int i:nums){
            for(int j=target;j>=i;j--){
                if(dp[j-i]){
                    if(j==target) return true;
                    dp[j]=true;
                }
            }
        }
        return dp[target];
    }
}
