public class Solution {
    public int combinationSum4(int[] nums, int target) {
        //set dp[target+1] dp[i] equals the number to get target
        // for every dp, try to take every nums as final number
        int length=nums.length;
        if(length==0){
            return 0;
        }
        Arrays.sort(nums);
        int[] dp=new int[target+1];
        dp[0]=1;
        for(int i=nums[0];i<=target;i++){
            for(int j:nums){
                if(j>i){
                    break;
                }
                dp[i]+=dp[i-j];
            }
        }
        return dp[target];
    }
}
