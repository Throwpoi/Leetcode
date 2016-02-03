import java.util.*;

public class Longest_Substring_Without_Repeating_Characters {
    public static int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> a=new HashMap<Character,Integer>();
        int max=0,temp=0,i=0,j=0;
        while(true){
        	while(j<s.length()&&!a.containsKey(s.charAt(j))){
        		a.put(s.charAt(j), j);j++;temp++;
        	}
        	max=Math.max(temp, max);
        	if(j==s.length()) break;
        	int k=a.get(s.charAt(j));
        	while(i<=k){
        		a.remove(s.charAt(i));i++;temp--;
        	}
        }
        return max;
    }
    
    public static void main(String[] args){
    	lengthOfLongestSubstring("aa");
    }
}
