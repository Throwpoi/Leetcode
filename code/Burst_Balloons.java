
public class Burst_Balloons {
    public int maxCoins(int[] nums) {
        int length=nums.length;
        int[] temp=new int[length+2];
        for(int i=1;i<=length;i++) temp[i]=nums[i-1];
        temp[0]=1;temp[length+1]=1;
        int[][] dp=new int[length+2][length+2];
        for(int i=3;i<=length+2;i++){
            for(int j=0;j<=length+2-i;j++){
                if(i==3) dp[j][j+2]=temp[j]*temp[j+1]*temp[j+2];
                else{
                    int max=0;
                    for(int k=j+1;k<j+i-1;k++){
                        max=Math.max(max,dp[j][k]+dp[k][j+i-1]+temp[j]*temp[k]*temp[j+i-1]);
                    }
                    dp[j][j+i-1]=max;
                }
            }
        }
        return dp[0][length+1];
    }
}
