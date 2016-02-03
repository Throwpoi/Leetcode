
public class Jump_Game_II {
    public static int jump(int[] nums) {
        if(nums.length==1) return 0;
        int i=0,result=1;
        while(i<nums.length){
            if(i+nums[i]>=nums.length-1) return result;
            if(nums[i]==0) return -1;
            int max=0,temp=0;
            for(int j=1;j<=nums[i];j++){
                if(j+nums[i+j]>max){
                    max=j+nums[i+j];
                    temp=j;
                }
            }
            i+=temp;result++;
        }
        return result; 
    }
    
    public static void main(String[] args){
    	int[] nums={1,2,1,1,1};
    	System.out.println(jump(nums));
    }
}
