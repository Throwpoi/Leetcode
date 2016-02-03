
public class H_Index {
    public int hIndex(int[] citations) {
        int length=citations.length;
        int start=0,end=length-1,mid=0;
        while(start<=end){
            mid=(start+end)/2;
            int temp=citations[mid];
            if(temp==length-1-mid) return length-1-mid;
            else if(temp==length-mid) return length-mid;
            else if(temp>length-mid) end=mid-1;
            else start=mid+1;
        }
        return length-start;
    }
}
