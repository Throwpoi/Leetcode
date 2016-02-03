import java.util.*;

public class Flip_Game_II {
    boolean help(String s, Map<String,Boolean> a){
        if(a.containsKey(s)) return a.get(s);
        int length=s.length();
        for(int i=0;i<length-1;i++){
            if(s.charAt(i)=='+'&&s.charAt(i+1)=='+'){
                String temp=s.substring(0,i)+"--"+s.substring(i+2);
                if(help(temp,a)) continue;
                a.put(s,true);
                return true;
            }
        }
        a.put(s,false);
        return false;
    }
    
    public boolean canWin(String s) {
        Map<String,Boolean> a=new HashMap<String,Boolean>();
        return help(s,a);
    }
}
