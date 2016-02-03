import java.util.*;

public class Contains_Duplicate_II {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> a=new HashSet<Integer>();
        int i=0;
        while(i<nums.length&&i<=k){
            if(a.contains(nums[i])) return true;
            a.add(nums[i++]);
        }
        while(i<nums.length){
            a.remove(nums[i-1-k]);
            if(a.contains(nums[i])) return true;
            a.add(nums[i++]);
        }
        return false;
    }
}
