import java.util.*;

public class Wiggle_Sort_II {
    void swap(int[] nums, int i, int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }

    public void wiggleSort(int[] nums) {
        int length=nums.length;
        Arrays.sort(nums);
        int mid=(length-1)/2;
        int[] temp=new int[length];
        int j=0;
        for(int i=mid;i>=((length%2==0)?0:1);i--){
            temp[j]=nums[i];
            temp[j+1]=nums[i+mid+(length%2==0?1:0)];
            j+=2;
        }
        if(length%2==1) temp[j]=nums[0];
        for(int i=0;i<length;i++) nums[i]=temp[i];
    }
}
