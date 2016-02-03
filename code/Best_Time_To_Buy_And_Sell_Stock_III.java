
public class Best_Time_To_Buy_And_Sell_Stock_III {
    public static int maxProfit(int[] prices) {
        int length=prices.length;
        if(length==0) return 0;
        int[] left=new int[length], right=new int[length];
        left[0]=0;right[length-1]=0;
        int min=prices[0], max=prices[length-1];
        for(int i=1;i<length;i++){
            if(prices[i]<=prices[i-1]) left[i]=left[i-1];
            else left[i]=Math.max(left[i-1],prices[i]-min);
            min=Math.min(min,prices[i]);
        }
        for(int i=length-2;i>=0;i--){
            if(prices[i]>=prices[i+1]) right[i]=right[i+1];
            else right[i]=Math.max(right[i+1],max-prices[i]);
            max=Math.max(max,prices[i]);
        }
        max=0;
        for(int i=0;i<length-1;i++){
            max=Math.max(max,left[i]+right[i+1]);
        }
        return Math.max(max,Math.max(right[0],left[length-1]));
    }
    
    public static void main(String[] args){
    	int[] nums={3,3,5,0,0,3,1,4};
    	maxProfit(nums);
    }
}
