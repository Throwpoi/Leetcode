
public class Discontinuous_Matches {
	//  c a t a p u l t
	//c 1 1 1 1 1 1 1 1
	//a 0 1 1 2 2 2 2 2
	//t 0 0 1 1 1 1 1 3	
	//dp[i][j]=dp[i-1][j]+(a.chatAt(i-1)==b.charAt(j-1))?dp[i-1][j-1]:0;
	
	public int match (String target, String source){
		int length1=target.length(),length2=source.length();
		int[][] dp=new int[length1+1][length2+1];
		for(int i=0;i<=length2;i++) dp[0][i]=1;
		for(int i=1;i<=length1;i++){
			for(int j=1;j<length2;j++){
				dp[i][j]=dp[i][j-1]+((target.charAt(i-1)==source.charAt(j-1))?dp[i-1][j-1]:0);
			}
		}
		return dp[length1][length2];
	}
}
