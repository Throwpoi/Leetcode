
public class Maximal_Square {
    public static int maximalSquare(char[][] matrix) {
        int length1=matrix.length;
        if(length1==0) return 0;
        int length2=matrix[0].length;
        if(length2==0) return 0;
        int min=Math.min(length1,length2);
        boolean[][][] dp=new boolean[min][length1][length2];
        boolean flag=false;
        for(int i=0;i<length1;i++){
            for(int j=0;j<length2;j++){
                dp[0][i][j]=(matrix[i][j]=='1');
                if(dp[0][i][j]) flag=true;
            }
        }
        if(!flag) return 0;
        for(int k=2;k<=min;k++){
            flag=false;
            for(int i=0;i<=length1-k;i++){
                for(int j=0;j<=length2-k;j++){
                    dp[k-1][i][j]=(dp[k-2][i][j]&&dp[k-2][i][j+1]&&dp[k-2][i+1][j]&&dp[k-2][i+1][j+1]);
                    if(dp[k-1][i][j]) flag=true;
                }
            }
            if(!flag) return (k-1)*(k-1);
        }
        return min*min;
    }
    
    public static void main(String[] args){
    	char[][] matrix={{'1','1','1','1'},
    			         {'1','1','1','1'},
    			         {'1','1','1','1'}};
    	maximalSquare(matrix);
    }
}
