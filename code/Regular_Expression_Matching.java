
public class Regular_Expression_Matching {
    public static boolean isMatch(String s, String p) {
        boolean[][] dp=new boolean[s.length()+1][p.length()+1];
        dp[0][0]=true;int k=0;
        while(k+1<p.length()&&p.charAt(k+1)=='*'){dp[0][k+2]=true;k+=2;}
        for(int i=1;i<=s.length();i++){
        	for(int j=1;j<=p.length();j++){
        		if(p.charAt(j-1)=='.') dp[i][j]=dp[i-1][j-1];
        		else if(p.charAt(j-1)=='*') dp[i][j]=dp[i][j]=dp[i][j-2]||
        				(dp[i-1][j]&&(p.charAt(j-2)=='.'||(s.charAt(i-1)==p.charAt(j-2))));
        		else dp[i][j]=dp[i-1][j-1]&&(s.charAt(i-1)==p.charAt(j-1));
        	}
        }
        return dp[s.length()][p.length()];
    }
    
    public static void main(String[] args){
    	isMatch("ab",".*c");
    }
}
