import java.util.*;

public class Permutations {
    void help(int[] nums, boolean[] flag, List<Integer> temp, List<List<Integer>> result){
        boolean flag1=false;
        Set<Integer> a=new HashSet<Integer>();
        for(int i=0;i<nums.length;i++){
            if(!flag[i]&&!a.contains(nums[i])){
                flag[i]=true;a.add(nums[i]);temp.add(nums[i]);
                help(nums,flag,temp,result);flag1=true;
                flag[i]=false;temp.remove(temp.size()-1);
            }
        }
        if(!flag1) result.add(new ArrayList<Integer>(temp));
    }
    
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result=new ArrayList<List<Integer>>();
        List<Integer>  temp=new ArrayList<Integer>();
        boolean[] flag=new boolean[nums.length];
        help(nums,flag,temp,result);
        return result;
    }
    
    public static void main(String[] args){
    	
    }
}
