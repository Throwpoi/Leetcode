import java.util.*;

public class Substring_With_Concatenation_Of_All_Words {
    public List<Integer> findSubstring(String s, String[] words) {
        Map<String,Integer> a=new HashMap<String,Integer>();
        List<Integer> result=new ArrayList<Integer>();
        if(words.length==0||words[0].length()>s.length()) return result;
        int length1=words.length;
        int length2=words[0].length();
        for(String temp:words){
        	if(!a.containsKey(temp)) a.put(temp,1);
        	else a.put(temp, a.get(temp)+1);
        }
        int i=0;
        int total=length1*length2;
        while(i<s.length()-total){
        	Map<String,Integer> b=new HashMap<String,Integer>(a);
        	int j=i;
        	String temp=s.substring(j,j+length2);
        	while(!b.isEmpty()&&b.containsKey(temp)){
        		j+=length2;
        		int t=b.get(temp);
        		if(t==1) b.remove(temp);
        		else b.put(temp, t-1);
        		if(j>=s.length()-length2) break;
        		else temp=s.substring(j,j+length2);
        	}
        	if(b.isEmpty())result.add(i);
        	i++;
        }
        return result;      
    }
}
