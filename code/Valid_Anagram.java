import java.util.*;

public class Valid_Anagram {
    public boolean isAnagram(String s, String t) {
        int length1=s.length(),length2=t.length();
        if(length1!=length2) return false;
        Map<Character,Integer> a=new HashMap<Character,Integer>();
        for(int i=0;i<length1;i++){
            char temp=s.charAt(i);
            if(!a.containsKey(temp)) a.put(temp,1);
            else a.put(temp,a.get(temp)+1);
        }
        for(int i=0;i<length2;i++){
            char temp=t.charAt(i);
            if(!a.containsKey(temp)) return false;
            else{
                if(a.get(temp)==1) a.remove(temp);
                else a.put(temp,a.get(temp)-1);
            }
        }
        return true;
    }
}
