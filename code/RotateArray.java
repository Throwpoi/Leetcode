
public class RotateArray {
    int help(int i, int k, int n){
        if(i>=n-k) return i-n+k;
        else return i+k;
    }
    
    void swap(int[] nums, int i, int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    
    public void rotate(int[] nums, int k) {
        int total=nums.length,i=0,n=nums.length;k%=n;
        if(k==0) return;
        while(total>0){
            int temp=i;
            while(help(temp,k,n)!=i){
                temp=help(temp,k,n);
                swap(nums,i,temp);
                total--;
            }
            total--;i++;
        }
    }
}
