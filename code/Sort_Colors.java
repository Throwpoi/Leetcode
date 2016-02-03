
public class Sort_Colors {
    void swap(int[] nums, int i, int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    
    public void sortColors(int[] nums) {
        int a=0,b=nums.length-1;
        for(int i=0;i<=b;i++){
            while(true){
                if(a<i&&nums[i]==0) swap(nums,a++,i);
                else if(i<b&&nums[i]==2) swap(nums,b--,i);
                else break;
            }
        }
    }
}
