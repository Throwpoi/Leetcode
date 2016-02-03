
public class Best_Time_To_Buy_And_Sell_Stock {
    public int maxProfit(int[] prices) {
        if(prices.length==0) return 0;
        int min=prices[0], max=0;
        for(int i=1;i<prices.length;i++){
            max=Math.max(max,prices[i]-min);
            if(prices[i]<min) min=prices[i];
        }
        return max;
    }
}
