
public class First_Missing_Positive {
    void swap(int[] nums, int i, int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    
    public int firstMissingPositive(int[] nums) {
        int length=nums.length;
        for(int i=0;i<length;i++){
            while(nums[i]>0&&nums[i]<=length&&i+1!=nums[i]){
                if(nums[nums[i]-1]==nums[i]) break;
                else swap(nums,i,nums[i]-1);
            }
        }
        for(int i=0;i<nums.length;i++){
            if(i+1!=nums[i]) return i+1;
        }
        return nums.length+1;
    }
}
