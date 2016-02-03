
public class Paint_Fence {
    public int numWays(int n, int k) {
        if(n==0||k==0) return 0;
        int[] dp1=new int[n];
        int[] dp2=new int[n];
        dp1[0]=k;dp2[0]=0;
        for(int i=1;i<n;i++){
            dp1[i]=dp1[i-1]*(k-1)+dp2[i-1]*(k-1);
            dp2[i]=dp1[i-1];
        }
        return dp1[n-1]+dp2[n-1];
    }
}
