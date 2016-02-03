
public class Next_Permutation {
	void swap(int[] nums, int i, int j){
		int temp=nums[i];
		nums[i]=nums[j];
		nums[j]=temp;
	}
	
	void reverse(int[] nums, int i, int j){
		while(i<j) swap(nums,i++,j--);
	}
	
    public void nextPermutation(int[] nums) {
    	int length=nums.length,p=-1,temp=0;
    	if(length==1) return;
    	for(int i=length-2;i>=0;i--){
    		if(nums[i]<nums[i+1]){
    			p=i+1;temp=nums[i];break;
    		}
    	}
    	if(p==-1){reverse(nums,0,length-1);return;}
    	for(int i=length-1;i>=p;i--){
    		if(nums[i]>temp){
    			swap(nums,p-1,i);
    			reverse(nums,p,length-1);
    			return;
    		}
    	} 
    }
}
