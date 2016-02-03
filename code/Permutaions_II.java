import java.util.*;

public class Permutaions_II {
    void help(int[] nums, boolean[] flag, List<Integer> temp, List<List<Integer>> result){
        if(temp.size()==nums.length){
            result.add(new ArrayList<Integer>(temp));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(i>0&&!flag[i-1]&&nums[i]==nums[i-1]) continue;
            if(!flag[i]){
                flag[i]=true;temp.add(nums[i]);
                help(nums,flag,temp,result);
                flag[i]=false;temp.remove(temp.size()-1);
            }
        }
    }
    
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result=new ArrayList<List<Integer>>();
        List<Integer>  temp=new ArrayList<Integer>();
        Arrays.sort(nums);
        boolean[] flag=new boolean[nums.length];
        help(nums,flag,temp,result);
        return result;
    }
}
