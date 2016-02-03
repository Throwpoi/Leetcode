import java.util.*;

public class Palindrome_Permutation_II {
    void help(int i, int length, char[] k, char[] temp, Character mid, boolean[] visited, List<String> result){
        if(i==length/2){
            if(mid!=null) temp[i]=mid;
            result.add(String.valueOf(temp));
            return;
        }
        for(int j=0;j<length/2;j++){
            if(visited[j]||(j>0&&k[j]==k[j-1]&&!visited[j-1])) continue;
            temp[i]=temp[length-1-i]=k[j];
            visited[j]=true;
            help(i+1,length,k,temp,mid,visited,result);
            visited[j]=false;
        }
    }
    
    public List<String> generatePalindromes(String s) {
        List<String> result=new ArrayList<String>();
        Set<Character> a=new HashSet<Character>();
        Map<Character,Integer> b=new HashMap<Character,Integer>();
        int length=s.length();
        for(int i=0;i<length;i++){
            char temp=s.charAt(i);
            if(a.contains(temp)) a.remove(temp);
            else a.add(temp);
            if(b.containsKey(temp)) b.put(temp,b.get(temp)+1);
            else b.put(temp,1);
        }
        char k[]=new char[length/2];
        boolean[] visited=new boolean[length/2];
        int index=0;
        if(a.size()>=2) return result;
        Character mid=null;
        for(char i:b.keySet()){
            int temp=b.get(i);
            if(temp%2!=0){mid=i;temp--;}
            temp/=2;
            for(int j=0;j<temp;j++) k[index++]=i;
        }
        char[] temp1=new char[length];
        help(0,length,k,temp1,mid,visited,result);
        return result;
    }
}
