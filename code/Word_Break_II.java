import java.util.*;

public class Word_Break_II {
    void help(List<String> result, StringBuilder temp, String s, Set<String> wordDict){
        if(s.length()==0){
            temp.deleteCharAt(temp.length()-1);
            String k=temp.toString(); result.add(k);
            temp.append(" ");return;
        }
        for(int i=0;i<s.length();i++){
            String a=s.substring(0,i+1);
            if(wordDict.contains(a)){
                temp.append(a+" ");
                help(result,temp,s.substring(i+1),wordDict);
                temp.delete(temp.length()-1-a.length(),temp.length());
            }
        }
    }
    
    public List<String> wordBreak(String s, Set<String> wordDict) {
        int length=s.length();
        List<String> result=new ArrayList<String>();
        if(length==0) return result;
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
        if(!dp[length]) return result;
        StringBuilder temp=new StringBuilder();
        help(result,temp,s,wordDict);
        return result;
    }
}
