import java.util.*;

class Interval {
    int start;
    int end;
    Interval() { start = 0; end = 0; }
    Interval(int s, int e) { start = s; end = e; }
}

public class Merge_Intervals {
    public List<Interval> merge(List<Interval> intervals) {
        int i=0;
        List<Interval> result=new ArrayList<Interval>();
        if(intervals.size()==0) return result;
        Collections.sort(intervals,new Comparator<Interval>(){
            public int compare(Interval a, Interval b){
                return a.start-b.start;
            }
        });
        while(i<intervals.size()-1){
            Interval temp1=intervals.get(i),temp2=intervals.get(i+1);
            if(temp1.end<temp2.start){
                result.add(new Interval(temp1.start,temp1.end));
            }
            else{
                if(temp1.end>temp2.end) temp2.end=temp1.end;
                temp2.start=temp1.start;
            }
            i++;
        }
        result.add(new Interval(intervals.get(i).start,intervals.get(i).end));
        return result;
    }
}
