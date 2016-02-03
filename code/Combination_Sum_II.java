import java.util.*;

public class Combination_Sum_II {
    void help(List<List<Integer>> output, List<Integer> temp, int[] candidates, int target, int start){
        if(target==0){
            output.add(new ArrayList<Integer>(temp));
            return;
        }
        for(int i=start;i<candidates.length;i++){
            if(i>start&&candidates[i]==candidates[i-1]) continue;
            int k=candidates[i];
            if(k>target) break;
            temp.add(k);
            help(output,temp,candidates,target-k,i+1);
            temp.remove(temp.size()-1);
        }
    }
    
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> output=new ArrayList<List<Integer>>();
        if(candidates.length==0) return output;
        Arrays.sort(candidates);
        List<Integer> temp=new ArrayList<Integer>();
        help(output,temp,candidates,target,0);
        return output;
    }
}
