public class Remove_Duplicates_From_Sorted_Array {
	static void swap(int[] nums, int i, int j){
		int temp=nums[i];
		nums[i]=nums[j];
		nums[j]=temp;
	}
	
    public static int removeDuplicates(int[] nums) {
        int length=nums.length;
        if(length<=1) return length;
    	int temp=nums[0],j=0,result=1;
    	for(int i=0;i<nums.length;i++){
    		if(nums[i]==temp) continue;
    		else{
    			temp=nums[i];
    			swap(nums,++j,i);
    			result++;
    		}
    	}
    	return result;
    }
    
    public static void main(String[] args){
    	int[] nums={1,1,3,4,4,4,5,5,6,7,7,7};
    	System.out.println(removeDuplicates(nums));
    	for(int i:nums) System.out.print(i+" ");
    }
}
