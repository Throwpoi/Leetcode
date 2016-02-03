
public class Range_Sum_Query_2D_Immutable {
    int[][] dp;
    public Range_Sum_Query_2D_Immutable(int[][] matrix) {
        int length1=matrix.length;
        if(length1==0){dp=new int[1][1];return;}
        int length2=matrix[0].length;
        if(length2==0){dp=new int[1][1];return;}
        dp=new int[length1+1][length2+1];
        for(int i=1;i<=length1;i++){
            for(int j=1;j<=length2;j++){
                dp[i][j]=matrix[i-1][j-1]+dp[i-1][j]+dp[i][j-1]-dp[i-1][j-1];
            }
        }
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        return dp[row2+1][col2+1]-(dp[row2+1][col1]+dp[row1][col2+1]-dp[row1][col1]);
    }
    
    public static void main(String[] args){
    	int[][] num={{1},{-7}};
    	Range_Sum_Query_2D_Immutable a=new Range_Sum_Query_2D_Immutable(num);
    	a.sumRegion(0,0,0,0);
    	a.sumRegion(1,0,1,0);
    	a.sumRegion(0,0,1,0);
    }
}
