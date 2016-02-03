import java.util.*;

public class Kth_Largest_Element_In_An_Array {
    public int findKthLargest(int[] nums, int k) {
        int length=nums.length;
        int index=length-k;
        PriorityQueue<Integer> a=new PriorityQueue<Integer>();
        for(int i:nums) a.offer(i);
        int result=0;
        while(index>=0){result=a.poll();index--;}
        return result;
    }
    
    void swap(int[] nums, int i, int j){
        int temp=nums[i];nums[i]=nums[j];nums[j]=temp;
    }
    
    int help(int[] nums, int start, int end, int index){
        if(start==end) return nums[start];
        int temp=nums[start],i=start,j=start+1;
        while(j<=end){
            if(nums[j]<temp){
                if(i+1<j) swap(nums,++i,j++);
                else{i++;j++;}
            }
            else j++;
        }
        swap(nums,start,i);
        if(index==(i-start)) return nums[i]; 
        else if(index<(i-start)) return help(nums,start,i-1,index);
        else return help(nums,i+1,end,index-(i-start+1));
    }
    
    public int findKthLargest1(int[] nums, int k) {
        int length=nums.length;
        int index=length-k;
        return help(nums,0,length-1,index);
    }
}
