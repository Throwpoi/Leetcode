
public class Maximum_Product_Subarray {
    public int maxProduct(int[] nums) {
        int length=nums.length;
        int result=nums[0];
        int[] min=new int[length];
        int[] max=new int[length];
        min[0]=max[0]=nums[0];
        for(int i=1;i<length;i++){
            int a=nums[i]*max[i-1],b=nums[i]*min[i-1];
            max[i]=Math.max(nums[i],Math.max(a,b));
            min[i]=Math.min(nums[i],Math.min(a,b));
            result=Math.max(result,max[i]);
        }
        return result;
    }
}
