
public class Sqrt_x {
    public int mySqrt(int x) {
        int start=0,end=46340;
        while(start<=end){
            int mid=start+(end-start)/2;
            int temp=mid*mid;
            if(temp==x) return mid;
            else if(temp>x) end=mid-1;
            else start=mid+1;
        }
        return end;
    }
    
	public static void main(String[] args){
		System.out.println(Integer.MAX_VALUE);
	}
}
