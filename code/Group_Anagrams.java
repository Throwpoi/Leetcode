import java.util.*;

public class Group_Anagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> output=new ArrayList<List<String>>();
        Map<String, List<String>> a=new HashMap<String, List<String>>();
        Arrays.sort(strs);
        for(int i=0;i<strs.length;i++){
            char[] temp=strs[i].toCharArray();
            Arrays.sort(temp);
            String k=String.valueOf(temp);
            if(!a.containsKey(k)){
                List<String> b=new ArrayList<String>();
                b.add(strs[i]);a.put(k,b);
            }
            else a.get(k).add(strs[i]);
        }
        for(List<String> temp:a.values()) output.add(temp);
        return output;    	
    }
}
