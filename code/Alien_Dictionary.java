import java.util.*;

public class Alien_Dictionary {
    public static String alienOrder(String[] words) {
        Set[] a=new Set[26];
        int[] indegree=new int[26];
        for(int i=0;i<26;i++){
            a[i]=new HashSet<Character>();
            indegree[i]=-1;
        }
        int length=words.length;
        for(int i=0;i<length;i++){
            String temp=words[i];
            int length2=temp.length();
            int j=1;
            while(j<length2&&temp.charAt(j-1)==temp.charAt(j)){j++;}
            while(j<length2){
                char temp1=temp.charAt(j),temp2=temp.charAt(j-1);
                if(!a[temp2-'a'].contains(temp1)){
                a[temp2-'a'].add(temp1);
                if(indegree[temp2-'a']==-1) indegree[temp2-'a']=0;
                if(indegree[temp1-'a']==-1) indegree[temp1-'a']=1;
                else indegree[temp1-'a']++;
                }
                j++;
                while(j<length2&&temp.charAt(j-1)==temp.charAt(j)){j++;}
            }
        }
        Queue<Character> b=new LinkedList<Character>();
        for(int i=0;i<26;i++){
            if(indegree[i]==0) b.add((char)('a'+i));
        }
        StringBuilder result=new StringBuilder();
        int num1=0,num2=26;
        for(int i=0;i<26;i++){
            if(indegree[i]==-1) num2--;
        }
        while(!b.isEmpty()){
            char temp=b.poll();
            num1++;
            if(indegree[temp-'a']==0) result.append(temp);
            for(char k:(Set<Character>)a[temp-'a']){
                indegree[k-'a']--;
                if(indegree[k-'a']==0) b.offer(k);
            }
        }
        if(num1!=num2){
        	System.out.println("aaaaa");
        	return "";
        }
        else return result.toString();
    }
    
    public static void main(String[] args){
    	String[] words={"wrt","wrf","er","ett","rftt"};
    	List<Integer> a=new ArrayList<Integer>();
    	//alienOrder(words);
    	String k=" 34233424 234324 wffew ";
    	System.out.println(k);
    }
}
