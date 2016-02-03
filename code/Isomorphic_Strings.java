import java.util.*;

public class Isomorphic_Strings {
    public boolean isIsomorphic(String s, String t) {
        Map<Character,Character> a=new HashMap<Character,Character>();
        Set<Character> b=new HashSet<Character>();
        for(int i=0;i<s.length();i++){
            char temp1=s.charAt(i),temp2=t.charAt(i);
            if(a.containsKey(temp1)){
                if(a.get(temp1)!=temp2) return false;
            }
            else{
                if(b.contains(temp2)) return false;
                a.put(temp1,temp2);b.add(temp2);
            }
        }
        return true;
    }
}
