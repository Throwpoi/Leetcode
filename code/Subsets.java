import java.util.*;

public class Subsets {
    static void help(int start, int n, int[] nums, List<Integer> temp, List<List<Integer>> result){
        if(n==0){
            result.add(new ArrayList<Integer>(temp));
            return;
        }
        int length=nums.length;
        for(int i=start;i<=length-n;i++){
            temp.add(nums[i]);
            help(i+1,n-1,nums,temp,result);
            temp.remove(temp.size()-1);
        }
    }
    
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result=new ArrayList<List<Integer>>();
        List<Integer> temp=new ArrayList<Integer>();
        Arrays.sort(nums);
        for(int i=0;i<=nums.length;i++){
            help(0,i,nums,temp,result);
        }
        return result;
    }
    
    public static void main(String[] args){
    	int[] nums={1,2,3,4,5,6,7,8,10,0};
    	System.out.println(subsets(nums));
    	System.out.println(1);
    }
}
