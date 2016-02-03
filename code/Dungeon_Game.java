
public class Dungeon_Game {
    public int calculateMinimumHP(int[][] dungeon) {
        int length1=dungeon.length,length2=dungeon[0].length;
        int[][] dp=new int[length1][length2];
        dp[length1-1][length2-1]=(dungeon[length1-1][length2-1]>=0)?1:(1-dungeon[length1-1][length2-1]);
        for(int i=length1-2;i>=0;i--){
            int temp=dp[i+1][length2-1]-dungeon[i][length2-1];
            dp[i][length2-1]=(temp>0?temp:1);
        }
        for(int i=length2-2;i>=0;i--){
            int temp=dp[length1-1][i+1]-dungeon[length1-1][i];
            dp[length1-1][i]=(temp>0?temp:1);
        }        
        for(int i=length1-2;i>=0;i--){
            for(int j=length2-2;j>=0;j--){
                int temp=Math.min(dp[i][j+1],dp[i+1][j])-dungeon[i][j];
                dp[i][j]=(temp>0?temp:1);
            }
        }
        return dp[0][0];
    }
}
