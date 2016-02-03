
public class Minimum_Path_Sum {
    public int minPathSum(int[][] grid) {
        int length1=grid.length;
        int length2=grid[0].length;
        int[][] dp=new int[length1][length2];
        dp[0][0]=grid[0][0];
        for(int i=1;i<length1;i++) dp[i][0]=dp[i-1][0]+grid[i][0];
        for(int i=1;i<length2;i++) dp[0][i]=dp[0][i-1]+grid[0][i];
        for(int i=1;i<length1;i++){
            for(int j=1;j<length2;j++){
                dp[i][j]=Math.min(dp[i-1][j],dp[i][j-1])+grid[i][j];
            }
        }
        return dp[length1-1][length2-1];
    }
}
