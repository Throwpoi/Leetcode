import java.util.*;

public class Group_Shifted_Strings {
    char update(char in){
        if(in=='z') return 'a';
        else return (char)(in+1);
    }
    
    String update(String in){
        StringBuilder out=new StringBuilder();
        for(int i=0;i<in.length();i++){
            out.append(update(in.charAt(i)));
        }
        return out.toString();
    }
    
    public List<List<String>> groupStrings(String[] strings) {
        Map<String,Integer> a=new HashMap<String,Integer>();
        List<List<String>> result=new ArrayList<List<String>>();
        for(int i=0;i<strings.length;i++){
            if(!a.containsKey(strings[i])) a.put(strings[i],1);
            else a.put(strings[i],a.get(strings[i])+1);
        }
        for(int i=0;i<strings.length;i++){
            String k=strings[i];
            if(a.containsKey(k)){
                List<String> temp=new ArrayList<String>();
                int duplicate=a.get(k);
                while(duplicate>0){temp.add(k);duplicate--;}
                String newK=update(k);
                while(!newK.equals(k)){
                    if(a.containsKey(newK)){
                        duplicate=a.get(newK);
                        while(duplicate>0){temp.add(newK);duplicate--;}
                        a.remove(newK);
                    }
                    newK=update(newK);
                }
                Collections.sort(temp);
                result.add(new ArrayList<String>(temp));
            }
            a.remove(k);
        }
        return result;
    }
}
