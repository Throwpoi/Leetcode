
public class Move_Zeroes {
    void swap(int[] nums, int i, int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    
    public void moveZeroes(int[] nums) {
        int num=0,length=nums.length;
        for(int i=0;i<length;i++){
            if(nums[i]==0) num++;
        }
        int j=0;
        for(int i=0;i<length;i++){
            if(nums[i]!=0){
                if(i!=j) swap(nums,i,j++);
                else j++;
            }
        }
        for(int i=length-1;i>=length-num;i--) nums[i]=0;
    }
}
