
public class Single_Number_II {
    public int singleNumber(int[] nums) {
        int first=0,second=0;
        for(int i=0;i<nums.length;i++){
            int temp=nums[i], k=temp;
            k&=(k^second); 
            second&=(temp^second);
            second|=(temp&first);
            first^=k;
        }
        return first;
    }
}
