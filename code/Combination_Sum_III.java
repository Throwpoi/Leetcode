import java.util.*;

public class Combination_Sum_III {
    void help(List<Integer> temp, List<List<Integer>> result, int start, int k, int n){
        int length=temp.size();
        if(length==k){
            result.add(new ArrayList<Integer>(temp));
            return;
        }
        int remain=k-length-1;
        int min=(start+start+remain-1)*remain/2;
        int max=(9+9-(remain-1))*remain/2;
        for(int i=Math.max(n-max,start);i<=Math.min(n-min,9);i++){
            temp.add(i);
            help(temp,result,i+1,k,n-i);
            temp.remove(temp.size()-1);
        }
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result=new ArrayList<List<Integer>>();
        List<Integer> temp=new ArrayList<Integer>();
        help(temp,result,1,k,n);
        return result;
    }
}
