
public class Best_Time_To_Buy_And_Sell_Stock_With_Cooldown {
    public int maxProfit(int[] prices) {
        int length=prices.length;
        if(length==0) return 0;
        int[] buy=new int[length];
        int[] sell=new int[length];
        int[] cooldown=new int[length];
        for(int i=1;i<length;i++){
            buy[i]=Math.max(buy[i-1]+prices[i]-prices[i-1],cooldown[i-1]);
            sell[i]=buy[i-1]+prices[i]-prices[i-1];
            cooldown[i]=Math.max(sell[i-1],cooldown[i-1]);
        }
        return Math.max(sell[length-1],cooldown[length-1]);
    }
}
