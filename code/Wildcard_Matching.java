
public class Wildcard_Matching {
    public boolean isMatch(String s, String p) {
        boolean[][] dp=new boolean[s.length()+1][p.length()+1];
        int k=1;dp[0][0]=true;
        while(k<=p.length()&&p.charAt(k-1)=='*') dp[0][k++]=true;
        for(int i=1;i<=s.length();i++){
            for(int j=1;j<=p.length();j++){
                if(p.charAt(j-1)=='?') dp[i][j]=dp[i-1][j-1];
                else if(p.charAt(j-1)=='*') dp[i][j]=dp[i][j-1]||dp[i-1][j];
                else dp[i][j]=dp[i-1][j-1]&&(s.charAt(i-1)==p.charAt(j-1));
            }
        }
        return dp[s.length()][p.length()];
    }
}
