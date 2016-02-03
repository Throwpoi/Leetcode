import java.util.*;

public class Longest_Consecutive_Sequence {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        int max=1;
        Set<Integer> a=new HashSet<Integer>();
        for(int i:nums) a.add(i);
        for(int i:nums){
            if(a.isEmpty()) break;
            if(!a.contains(i)) continue;
            int left=i-1,right=i+1,temp=1;
            a.remove(i);
            while(!a.isEmpty()&&a.contains(left)){a.remove(left);left--;temp++;}
            while(!a.isEmpty()&&a.contains(right)){a.remove(right);right++;temp++;}
            max=Math.max(max,temp);
        }
        return max;
    }
}
