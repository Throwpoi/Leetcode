import java.util.*;

public class Longest_Substring_With_At_Most_Two_Distinct_Characters {
    public int lengthOfLongestSubstringTwoDistinct(String s) {
        int result=0;
        Map<Character,Integer> a=new HashMap<Character,Integer>();
        int length=s.length();
        int i=0,j=0;
        while(j<length){
            char temp=s.charAt(j);
            if(a.containsKey(temp)){a.put(temp,a.get(temp)+1);j++;}
            else{
                if(a.size()<2){a.put(temp,1);j++;}
                else{
                    while(a.size()==2){
                        char temp2=s.charAt(i);
                        if(a.get(temp2)==1) a.remove(temp2);
                        else a.put(temp2,a.get(temp2)-1);
                        i++;
                    }
                } 
            }
            result=Math.max(result,j-i);
        }
        return result;
    }
}
