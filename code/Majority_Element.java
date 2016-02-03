
public class Majority_Element {
    public static int majorityElement(int[] nums) {
        int vote=nums[0],num=1;
        for(int i=1;i<nums.length;i++){
            int temp=nums[i];
            if(temp==vote) num++;
            else if(num!=1) num--;
            else{
                vote=nums[i];
            }
        }
        return vote;
    }
    
    public static int majorityElement1(int[] nums) {
        int[] bit = new int[32];
        for (int num: nums)
            for (int i=0; i<32; i++) 
                if ((num>>(31-i) & 1) == 1)
                    bit[i]++;
        int ret=0;
        for (int i=0; i<32; i++) {
            bit[i]=bit[i]>nums.length/2?1:0;
            ret += bit[i]*(1<<(31-i));
        }
        return ret;
    }
    
    public static void main(String[] args){
    	int[] nums={-1,3,7,-1,-1,-1,-1,6};
    	System.out.println(majorityElement1(nums));
    }
}
