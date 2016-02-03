
public class Interleaving_String {
    public boolean isInterleave(String s1, String s2, String s3) {
        int length1=s1.length(), length2=s2.length();
        if(s3.length()!=length1+length2) return false;
        boolean dp[][]=new boolean[length1+1][length2+1];
        dp[0][0]=true;
        for(int i=1;i<=length1;i++){
            if(dp[i-1][0]&&s1.charAt(i-1)==s3.charAt(i-1)) dp[i][0]=true;
            else break;
        }
        for(int i=1;i<=length2;i++){
            if(dp[0][i-1]&&s2.charAt(i-1)==s3.charAt(i-1)) dp[0][i]=true;
            else break;
        }
        for(int i=1;i<=length1;i++){
            for(int j=1;j<=length2;j++){
                if((dp[i-1][j]&&s1.charAt(i-1)==s3.charAt(i+j-1))||
                    (dp[i][j-1]&&s2.charAt(j-1)==s3.charAt(i+j-1)))
                    dp[i][j]=true;
            }
        }
        return dp[length1][length2];
    }
}
