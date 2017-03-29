public class Solution {
    private int getM(String str){
        int m=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='0'){
                m++;
            }
        }
        return m;
    }
    
    public int findMaxForm(String[] strs, int m, int n) {
        if(strs.length==0){
            return 0;
        }
        int length=strs.length;
        int[][] dp=new int[m+1][n+1];
        for(int k=0;k<length;k++){
            int mm=getM(strs[k]);
            int nn=strs[k].length()-mm;
            if(mm==0&&nn==0){
                continue;
            }
            for(int i=m;i>=mm;i--){
                for(int j=n;j>=nn;j--){
                    dp[i][j]=Math.max(dp[i][j],dp[i-mm][j-nn]+1);
                }
            }
        }
        return dp[m][n];
    }
}
