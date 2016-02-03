import java.util.*;

public class Subsets_II {
    void help(int[] nums, int start, int n, List<Integer> temp, List<List<Integer>> result){
        if(n==0){
            result.add(new ArrayList<Integer>(temp));
            return;
        }
        for(int i=start;i<=nums.length-n;i++){
            if(i!=start&&nums[i]==nums[i-1]) continue;
            temp.add(nums[i]);
            help(nums,i+1,n-1,temp,result);
            temp.remove(temp.size()-1);
        }
    }
    
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<Integer> temp=new ArrayList<Integer>();
        List<List<Integer>> result=new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        for(int i=0;i<=nums.length;i++){
            help(nums,0,i,temp,result);
        }
        return result;
    }
}
