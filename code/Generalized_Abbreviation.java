import java.util.*;

public class Generalized_Abbreviation {
    boolean judge(char in){
        return in=='1';
    }
    
    void help(String word, StringBuilder temp, int i, int length, Set<String> result){
        if(i==length){
            int j=0,length1=temp.length();
            StringBuilder k=new StringBuilder();
            while(j<length1){
                if(!judge(temp.charAt(j))) k.append(temp.charAt(j++));
                else{
                    int num=0;
                    while(j<length1&&judge(temp.charAt(j))){num++;j++;}
                    k.append(String.valueOf(num));
                }
            }
            result.add(k.toString());
            return;
        }
        temp.append('1');
        help(word,temp,i+1,length,result);
        temp.deleteCharAt(temp.length()-1);
        temp.append(word.charAt(i));
        help(word,temp,i+1,length,result);
        temp.deleteCharAt(temp.length()-1);        
    }
    
    public List<String> generateAbbreviations(String word) {
        Set<String> result=new HashSet<String>();
        StringBuilder temp=new StringBuilder();
        help(word,temp,0,word.length(),result);
        List<String> output=new ArrayList<String>();
        output.addAll(result);
        return output;
    }
}
