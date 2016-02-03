
public class House_Robber {
    public int rob(int[] nums) {
        int length=nums.length;
        if(length==0) return 0;
        int[] a=new int[length],b=new int[length];
        a[0]=nums[0];b[0]=0;
        for(int i=1;i<length;i++){
            a[i]=b[i-1]+nums[i];
            b[i]=Math.max(a[i-1],b[i-1]);
        }
        return Math.max(a[length-1],b[length-1]);
    }
}
