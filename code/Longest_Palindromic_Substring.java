
public class Longest_Palindromic_Substring {
    public String longestPalindrome(String s) {
        int length=s.length();
        int max=0;
        int maxi=0,maxj=0;
        boolean[][] dp=new boolean[length][length];
        for(int i=0;i<length;i++)
        	dp[i][i]=true;
        for(int i=length-1;i>=0;i--){
        	for(int j=i+1;j<length;j++){
        		dp[i][j]=((i+1>j-1||dp[i+1][j-1])&&s.charAt(i)==s.charAt(j))?true:false;
        		if(dp[i][j]){
        			if(j-i+1>max){
        				max=j-i+1;
            			maxi=i;maxj=j;
        			}
        		}
        	}
        }
        return s.substring(maxi,maxj+1);
    }
}
