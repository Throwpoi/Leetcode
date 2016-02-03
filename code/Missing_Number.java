
public class Missing_Number {
    public int missingNumber(int[] nums) {
        int sum=0,length=nums.length;
        for(int i:nums) sum+=i;
        return length*(length+1)/2-sum;
    }
}
