
public class Trapping_Rain_Water {
    public int trap(int[] height) {
    	int length=height.length,result=0;
        int left=0,right=length-1;
        while(left<length&&height[left]==0) left++;
        while(right>=0&&height[right]==0) right--;
        while(left<right){
        	if(height[left]>height[right]){
        		int temp=height[right];
        		while(left<=right&&height[--right]<temp) result+=temp;
        	}
        	else{
        		int temp=height[left];
        		while(left<=right&&height[++left]<temp) result+=temp;
        	}
        }
        return result;
    }
}
