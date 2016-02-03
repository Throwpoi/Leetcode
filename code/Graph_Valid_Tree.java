import java.util.*;

public class Graph_Valid_Tree {
    public static boolean validTree(int n, int[][] edges) {
        Set[] a=new Set[n];
        boolean[] visited=new boolean[n];
        for(int i=0;i<n;i++){
            a[i]=new HashSet<Integer>();
        }
        for(int[] temp:edges){
            a[temp[0]].add(temp[1]);
            a[temp[1]].add(temp[0]);
        }
        Queue<Integer> c=new LinkedList<Integer>();
        c.offer(0);
        visited[0]=true;
        int num=0;
        while(!c.isEmpty()){
            int temp=c.poll();
            num++;
            for(int k:(Set<Integer>)a[temp]){
                if(visited[k]) return false;
                visited[k]=true;
                a[k].remove(temp);
                c.offer(k);
            }
        }
        return n==num;
    }
    
    boolean help(int parent, int root, Set[] a, boolean[]visited, boolean[] visited2){
        for(int k:(Set<Integer>)a[root]){
            if(k==parent) continue;
            if(visited[k]) return false;
            visited[k]=true;
            visited2[k]=true;
            if(!help(root,k,a,visited,visited2)) return false;
            visited[k]=false;
        }
        return true;
    }
    
    public boolean validTree1(int n, int[][] edges) {
        Set[] a=new Set[n];
        boolean[] visited=new boolean[n];
        boolean[] visited2=new boolean[n];
        visited2[0]=true;
        for(int i=0;i<n;i++){
            a[i]=new HashSet<Integer>();
        }
        for(int[] temp:edges){
            a[temp[0]].add(temp[1]);
            a[temp[1]].add(temp[0]);
        }
        if(!help(-1,0,a,visited,visited2)) return false;
        for(int i=0;i<n;i++){
            if(!visited2[i]) return false;
        }
        return true;
    }
    
    public static void main(String[] args){
    	int[][] edges={
    		{0,1},{0,2},{1,2}
    	};
    	validTree(4,edges);
    }
}
