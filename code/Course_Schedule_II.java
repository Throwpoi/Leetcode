import java.util.*;

public class Course_Schedule_II {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int[] result=new int[numCourses];
        int index=0;
        Map<Integer,List<Integer>> a=new HashMap<Integer,List<Integer>>();
        int[] indegree=new int[numCourses];
        for(int[] temp:prerequisites){
            if(!a.containsKey(temp[1])){
                List<Integer> k=new ArrayList<Integer>();
                k.add(temp[0]);a.put(temp[1],k);
            }
            else a.get(temp[1]).add(temp[0]);
            indegree[temp[0]]++;
        }
        Queue<Integer> b=new LinkedList<Integer>();
        for(int i=0;i<numCourses;i++){
            if(indegree[i]==0){b.offer(i);result[index++]=i;}
        }
        int num=0;
        while(!b.isEmpty()){
            int temp=b.poll();
            if(a.containsKey(temp)){
                for(int k:a.get(temp)){
                    if(--indegree[k]==0){result[index++]=k;b.offer(k);}
                }
            }
            num++;
        }
        if(num!=numCourses) return new int[0];
        return result;
        
    }
}
