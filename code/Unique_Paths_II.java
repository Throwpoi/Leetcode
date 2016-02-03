
public class Unique_Paths_II {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int length1=obstacleGrid.length, length2=obstacleGrid[0].length;
        int[][] dp=new int[length1][length2];
        if(obstacleGrid[0][0]==1) return 0;
        dp[0][0]=1;int k=1,t=1;
        while(k<length1&&obstacleGrid[k][0]==0) dp[k++][0]=1;
        while(t<length2&&obstacleGrid[0][t]==0) dp[0][t++]=1;
        for(int i=1;i<length1;i++){
            for(int j=1;j<length2;j++){
                if(obstacleGrid[i][j]==0){
                    dp[i][j]=dp[i][j-1]+dp[i-1][j];
                }
            }
        }
        return dp[length1-1][length2-1];
    }
}
