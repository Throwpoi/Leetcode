import java.util.*;

public class Course_Schedule {
    boolean[] flag;
    boolean[] finished;
    
    boolean dfs(int i,Map<Integer, List<Integer>> a){
        if(!a.containsKey(i)) return true;
        flag[i]=true;
        for(int temp:a.get(i)){
            if(finished[temp]) continue;
            if(flag[temp]||!dfs(temp,a)) return false;
        }
        finished[i]=true;
        flag[i]=false;
        return true;
    }
    
    public boolean canFinish(int numCourses, int[][] prerequisites) {
    	Map<Integer, List<Integer>> a=new HashMap<Integer, List<Integer>>();
    	for(int[] k:prerequisites){
    		if(!a.containsKey(k[1])){
    			List<Integer> temp=new ArrayList<Integer>();
    			temp.add(k[0]);
    			a.put(k[1], temp);
    		}
    		else{
    			a.get(k[1]).add(k[0]);
    		}
    	}
    	flag=new boolean[numCourses];
    	finished=new boolean[numCourses];
    	for(int i=0;i<numCourses;i++){
    	    if(!finished[i]){
    	        if(!dfs(i,a)) return false;
    	        else finished[i]=true;
    	    }
    	}
    	return true;
    }
}
