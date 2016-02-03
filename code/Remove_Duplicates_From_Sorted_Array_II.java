
public class Remove_Duplicates_From_Sorted_Array_II {
    void swap(int[] nums, int i, int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    
    public int removeDuplicates(int[] nums) {
        if(nums.length==0) return 0;
        int i=1,temp=1,total=1,k=nums[0];
        for(int j=1;j<nums.length;j++){
            if(nums[j]==k){
                if(temp==0||temp==1){swap(nums,i++,j);temp++;total++;}
            }
            else{k=nums[j];swap(nums,i++,j);temp=1;total++;}
        }
        return total;
    }
}
