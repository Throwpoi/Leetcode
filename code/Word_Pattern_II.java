import java.util.*;

public class Word_Pattern_II {
    boolean help(String pattern, String str, String[] a, Map<String,Character> b){
        int length1=pattern.length(),length2=str.length();
        if(length1==0&&length2==0) return true;
        else if(length1==0&&length2!=0) return false;
        else if(length1!=0&&length2==0) return false;
        else{
            char temp=pattern.charAt(0);
            if(a[temp-'a'].length()!=0){
                String val=a[temp-'a'];
                int i=val.length();
                if(i<=length2&&str.substring(0,i).equals(val)) return help(pattern.substring(1),str.substring(i),a,b);
                else return false;
            }
            else{
                for(int i=1;i<=length2;i++){
                    String val=str.substring(0,i);
                    if(b.containsKey(val)&&b.get(val)!=temp) continue;
                    a[temp-'a']=val;
                    b.put(val,temp);
                    if(help(pattern.substring(1),str.substring(i),a,b)) return true;
                    a[temp-'a']="";
                    b.remove(val);
                }
                return false;
            }
        }
    }
    
    public boolean wordPatternMatch(String pattern, String str) {
        String[] a=new String[26];
        for(int i=0;i<26;i++) a[i]="";
        Map<String,Character> b=new HashMap<String,Character>();
        return help(pattern,str,a,b); 
    }
}
