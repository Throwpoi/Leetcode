public class Solution {
    public int eraseOverlapIntervals(Interval[] intervals) {
        int length=intervals.length;
        if(length==0){
            return 0;
        }
        int result=0;
        Arrays.sort(intervals, new Comparator<Interval>(){
            public int compare(Interval o1, Interval o2){
                return o1.end-o2.end;
            }
        });
        int temp=intervals[0].end;
        for(int i=1;i<intervals.length;i++){
            if(intervals[i].start<temp){
                result++;
            }
            else{
                temp=intervals[i].end;
            }
        }
        return result;
    }
}
