import java.util.*;

public class Contains_Duplicate_III {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        int i=0;
        TreeSet<Integer> a=new TreeSet<Integer>();
        while(i<nums.length&&i<=k){
            int temp=nums[i];
            Integer num1=a.floor(temp),num2=a.ceiling(temp);
            if((num1!=null&&(temp<=t+num1))||(num2!=null&&(num2-temp)<=t)) return true;
            a.add(temp);i++;
        }
        while(i<nums.length){
            a.remove(nums[i-1-k]);
            int temp=nums[i];
            Integer num1=a.floor(temp),num2=a.ceiling(temp);
            if((num1!=null&&(temp-num1)<=t)||(num2!=null&&(num2-temp)<=t)) return true;
            a.add(temp);i++;
        }
        return false;
    }
}
