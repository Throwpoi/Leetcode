
public class Wiggle_Sort {
    void swap(int[] nums, int i, int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    
    public void wiggleSort(int[] nums) {
        int length=nums.length;
        boolean flag=true;
        for(int i=0;i<length-1;i++){
            if(flag){
                if(nums[i]>nums[i+1]) swap(nums,i,i+1);
            }
            else{
                if(nums[i]<nums[i+1]) swap(nums,i,i+1);
            }
            flag=(flag?false:true);
        }
    }
}
