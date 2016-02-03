import java.util.*;

public class Minimum_Height_Trees {
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        List<Integer> result=new ArrayList<Integer>();
        if(n==2){result.add(0);result.add(1);return result;}
        List[] a=new List[n];
        int[] degree=new int[n];
        for(int i=0;i<n;i++){
            a[i]=new ArrayList<Integer>();
        }
        for(int[] temp:edges){
            a[temp[0]].add(temp[1]);
            a[temp[1]].add(temp[0]);
            degree[temp[0]]++;degree[temp[1]]++;
        }
        int total=n;
        Queue<Integer> b=new LinkedList<Integer>();
        for(int i=0;i<n;i++){
            if(degree[i]==1){
                b.offer(i);total--;
            }
        }
        while(total>2){
            Queue<Integer> c=new LinkedList<Integer>();
            while(!b.isEmpty()){
            int k=b.poll();
            for(int temp:(List<Integer>)a[k]){
                if(degree[temp]>1){
                    if(degree[temp]==2){c.offer(temp);total--;} 
                    degree[temp]--;
                }
            }
            }
            b=c;
        }
        for(int i=0;i<n;i++){
            if(degree[i]!=1) result.add(i);
        }
        return result;
    }
}
