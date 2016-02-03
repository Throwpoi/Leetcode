
public class Distinct_Subsequences {
    public int numDistinct(String s, String t) {
        int length1=t.length(),length2=s.length();
        if(length1==0||length2==0) return 0;
        int[][] dp=new int[length1][length2];
        dp[0][0]=(s.charAt(0)==t.charAt(0))?1:0;
        for(int i=1;i<length2;i++) dp[0][i]=dp[0][i-1]+((s.charAt(i)==t.charAt(0))?1:0);
        for(int i=1;i<length1;i++){
            for(int j=1;j<length2;j++){
                dp[i][j]=dp[i][j-1]+((t.charAt(i)==s.charAt(j))?dp[i-1][j-1]:0);
            }
        }
        return dp[length1-1][length2-1];
    }
}
