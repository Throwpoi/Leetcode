
public class Decode_Ways {
    public int numDecodings(String s) {
        if(s.length()==0) return 0;
        int[] dp=new int[s.length()+1];
        dp[0]=1;dp[1]=(s.charAt(0)=='0')?0:1;
        for(int i=2;i<=s.length();i++){
            char a=s.charAt(i-2), b=s.charAt(i-1);
            dp[i]=((b=='0')?0:dp[i-1])+((a=='1'||(a=='2'&&b<='6'))?dp[i-2]:0);
        }
        return dp[s.length()];
    }
}
