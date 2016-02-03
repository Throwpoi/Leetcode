
public class Product_Of_Array_Except_Self {
    public int[] productExceptSelf(int[] nums) {
        int length=nums.length;
        int[] a=new int[length],b=new int[length];
        a[0]=1;b[length-1]=1;
        for(int i=1;i<length;i++) a[i]=a[i-1]*nums[i-1];
        for(int i=length-2;i>=0;i--) b[i]=b[i+1]*nums[i+1];
        for(int i=0;i<length;i++) nums[i]=a[i]*b[i];
        return nums;
    }
}
