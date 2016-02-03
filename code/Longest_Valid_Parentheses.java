
public class Longest_Valid_Parentheses {
    public int longestValidParentheses1(String s) {
        int max=0;
        boolean dp[][]=new boolean[s.length()][s.length()];
        for(int i=s.length()-2;i>=0;i--){
            for(int j=i+1;j<s.length();j+=2){
                dp[i][j]=(s.charAt(i)=='('&&s.charAt(j)==')'&&(i+1==j||dp[i+1][j-1]));
                if(dp[i][j]) max=Math.max(max,j-i+1);
            }
        }
        return max;
    }
    
    public static int longestValidParentheses(String s) {
    	int max=0,length=s.length();
    	if(length==0) return 0;
    	int[] dp=new int[length];
    	dp[s.length()-1]=0;
    	for(int i=length-2;i>=0;i--){
    		if(s.charAt(i)==')') dp[i]=0;
    		else{
    			int j=i+1;
    			if(s.charAt(j)==')') dp[i]=(j==length-1)?2:(2+dp[j+1]);
    			else{
    				while(j<length&&dp[j]!=0)j+=dp[j];
    				if(j==length) dp[i]=0;
    				else dp[i]=(s.charAt(j)==')')?(j-i+1)+((j==length-1)?0:dp[j+1]):0;
    			}
    		}
    	}
    	for(int i=0;i<length;i++) max=Math.max(max, dp[i]);
    	return max;
    }
    
    public static void main(String[] args){
    	System.out.println(longestValidParentheses("((()))())"));
    }
}
