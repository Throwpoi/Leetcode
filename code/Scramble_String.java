
public class Scramble_String {
    public boolean isScramble(String s1, String s2) {
        int length=s1.length();
        boolean[][][] dp=new boolean[length][length][length];
        for(int i=0;i<length;i++)
            for(int j=0;j<length;j++)
                if(s1.charAt(i)==s2.charAt(j)) dp[0][i][j]=true;
        for(int k=1;k<length;k++){
            for(int i=0;i<length-k;i++){
                for(int j=0;j<length-k;j++){
                    boolean flag=false;
                    for(int t=0;t<k;t++){
                        if((dp[t][i][j]&&dp[k-t-1][i+t+1][j+t+1])||(dp[t][i][j+k-t]&&dp[k-t-1][i+t+1][j])){
                            flag=true;break;
                        }
                    }
                    if(flag) dp[k][i][j]=true;
                }
            }
        }
        return dp[length-1][0][0];
    }
}
