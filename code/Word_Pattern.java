import java.util.*;

public class Word_Pattern {
    public boolean wordPattern(String pattern, String str) {
        Map<Character,String> a=new HashMap<Character,String>();
        Set<String> b=new HashSet<String>();
        String[] temp=str.split(" ");
        int length=pattern.length();
        if(length!=temp.length) return false;
        for(int i=0;i<length;i++){
            char temp1=pattern.charAt(i);
            String temp2=temp[i];
            if(!a.containsKey(temp1)){
                if(b.contains(temp2)) return false;
                a.put(temp1,temp2);b.add(temp2);
            }
            else{
                String k=a.get(temp1);
                if(!k.equals(temp2)) return false;
            }
        }
        return true;
    }
}
