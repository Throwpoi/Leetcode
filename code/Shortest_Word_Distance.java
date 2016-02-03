import java.util.*;

public class Shortest_Word_Distance {
    public int shortestDistance(String[] words, String word1, String word2) {
        int length=words.length;
        Set<Integer> a=new HashSet<Integer>();
        Set<Integer> b=new HashSet<Integer>();
        for(int i=0;i<length;i++){
            String temp=words[i];
            if(temp.equals(word1)) a.add(i);
            if(temp.equals(word2)) b.add(i);
        }
        int min=Integer.MAX_VALUE;
        for(int i:a){
            for(int j:b){
                int distance=i-j;
                if(distance<0) distance=-distance;
                min=Math.min(min,distance);
            }
        }
        return min;
    }
    
}
