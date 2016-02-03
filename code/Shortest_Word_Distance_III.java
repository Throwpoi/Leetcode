import java.util.*;

public class Shortest_Word_Distance_III {
    public int shortestWordDistance(String[] words, String word1, String word2) {
        Map<String,List<Integer>> a=new HashMap<String,List<Integer>>();
        for(int i=0;i<words.length;i++){
           String temp=words[i];
           if(!a.containsKey(temp)){
               List<Integer> b=new ArrayList<Integer>();
               b.add(i);a.put(temp,b);
           }
           else{
               a.get(temp).add(i);
           }
        } 
        int min=Integer.MAX_VALUE;
        if(word1.equals(word2)){
            List<Integer> k=a.get(word1);
            for(int i=0;i<k.size()-1;i++){
                min=Math.min(min,(k.get(i+1)-k.get(i)));
            }
        }
        else{
            for(int i:a.get(word1)){
                for(int j:a.get(word2)){
                    int distance=i-j;
                    if(distance<0) distance=-distance;
                    min=Math.min(min,distance);
                }
            }
        }
        return min; 
    }
}
