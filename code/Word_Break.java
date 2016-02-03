import java.util.*;

public class Word_Break {
    public boolean wordBreak(String s, Set<String> wordDict) {
        int length=s.length();
        if(length==0) return false;
        boolean[] dp=new boolean[length+1];
        dp[0]=true;
        for(int i=1;i<=length;i++){
            boolean flag=false;
            for(int j=0;j<i;j++){
                if(dp[j]&&wordDict.contains(s.substring(j,i))){
                    flag=true;break;
                }
            }
            dp[i]=flag;
        }
        return dp[length];
    }
}
