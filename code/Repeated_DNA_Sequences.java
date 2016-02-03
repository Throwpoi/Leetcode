import java.util.*;

public class Repeated_DNA_Sequences {
    int help(char a){
        switch(a){
            case 'A': return 0;
            case 'C': return 1;
            case 'G': return 2;
            case 'T': return 3;
        }
        return -1;
    }
    
    public List<String> findRepeatedDnaSequences(String s) {
        Set<Integer> a=new HashSet<Integer>();
        Set<Integer> b=new HashSet<Integer>();
        List<String> result=new ArrayList<String>();
        for(int i=0;i<s.length()-9;i++){
            int temp=0;
            for(int j=i;j<i+10;j++){
                temp<<=2;temp+=help(s.charAt(j));
            }
            if(a.contains(temp)){
                if(!b.contains(temp)){b.add(temp);result.add(s.substring(i,i+10));}
            }
            else a.add(temp);
        }
        return result;
    }
}
