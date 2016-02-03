import java.util.*;

public class Number_Of_Connected_Components_In_An_Undirected_Graph {
    public int countComponents(int n, int[][] edges) {
        List[] a=new List[n];
        boolean[] visited=new boolean[n];
        for(int i=0;i<n;i++) a[i]=new ArrayList(); 
        for(int[] temp:edges){
            a[temp[0]].add(temp[1]);
            a[temp[1]].add(temp[0]);
        }
        int result=0;
        for(int i=0;i<n;i++){
            if(visited[i]) continue;
            result++;
            Queue<Integer> b=new LinkedList<Integer>();
            b.add(i);visited[i]=true;
            while(!b.isEmpty()){
                int temp=b.poll();
                for(int k:(List<Integer>)a[temp]){
                    if(!visited[k]){
                        visited[k]=true;
                        b.offer(k);
                    }
                }
            }
        }
        return result;
    }
}
