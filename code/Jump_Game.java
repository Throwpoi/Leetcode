
public class Jump_Game {
    public boolean canJump(int[] nums) {
        int i=0;
        while(i<nums.length){
            if(i+nums[i]>=nums.length-1) return true;
            if(nums[i]==0) return false;
            int max=0,temp=0;
            for(int j=1;j<=nums[i];j++){
                if(j+nums[i+j]>max){
                    max=j+nums[i+j];
                    temp=j;
                }
            }
            i+=temp;
        }
        return true;
    }
}
