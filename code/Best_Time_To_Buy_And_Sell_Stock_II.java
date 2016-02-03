
public class Best_Time_To_Buy_And_Sell_Stock_II {
    public int maxProfit(int[] prices) {
        int length=prices.length;
        if(length==0) return 0;
        int[] dp=new int[length];
        dp[0]=0;
        for(int i=1;i<length;i++){
            if(prices[i]<=prices[i-1]) dp[i]=dp[i-1];
            else dp[i]=dp[i-1]+prices[i]-prices[i-1];
        }
        return dp[length-1];
    }
}
