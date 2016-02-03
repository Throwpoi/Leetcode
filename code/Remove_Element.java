
public class Remove_Element {
	void swap(int[] nums, int i, int j){
		int temp=nums[i];
		nums[i]=nums[j];
		nums[j]=temp;
	}
	
    public int removeElement(int[] nums, int val) {
    	int i=0,length=0;
    	for(int j=0;j<nums.length;j++){
    		if(nums[j]==val) continue;
    		else if(i!=j){swap(nums,i++,j);length++;}
    		else{i++;length++;}
    	}
    	return length;
    }
    
    
}
