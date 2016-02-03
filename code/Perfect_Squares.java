
public class Perfect_Squares {
    public int numSquares(int n) {
        int[] dp=new int[n+1];
        for(int i=1;i<=n;i++){
            int temp=(int)Math.sqrt(i);
            if(temp*temp==i) dp[i]=1;
            else{
                int min=Integer.MAX_VALUE;
                for(int j=1;j<=temp;j++){
                    int k=dp[i-j*j];
                    if(k!=-1) min=Math.min(min,1+k);
                }
                if(min==Integer.MAX_VALUE) dp[i]=-1;
                else dp[i]=min;
            }
        }
        return dp[n];
    }
}
