public class First_Bad_Version {
	boolean isBadVersion(int a){
		return true;
	}
	
    public int firstBadVersion(int n) {
        int start=1,end=n,mid=start+(end-start)/2;
        while(start<end){
            if(isBadVersion(mid)) end=mid;
            else start=mid+1;
            mid=start+(end-start)/2;
        }
        return mid;
    }
}
