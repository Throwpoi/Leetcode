
public class Coin_Change {
    public int coinChange(int[] coins, int amount) {
        int[] dp=new int[amount+1];
        for(int i=1;i<=amount;i++){
            int min=Integer.MAX_VALUE;
            for(int temp:coins){
                if(i-temp<0) continue;
                else{
                    if(dp[i-temp]!=-1) min=Math.min(min,dp[i-temp]+1);
                }
            }
            if(min==Integer.MAX_VALUE) dp[i]=-1;
            else dp[i]=min;
        }
        return dp[amount];
    }
}
