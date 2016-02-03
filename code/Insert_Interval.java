import java.util.*;

public class Insert_Interval {
    public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
        List<Interval> result=new ArrayList<Interval>();
        int i=0,start=newInterval.start,end=newInterval.end;
        while(i<intervals.size()){
            Interval temp=intervals.get(i);
            if(temp.end<start){
                result.add(temp);i++;
            }
            else{start=Math.min(start,temp.start);break;}
        }
        while(i<intervals.size()){
            Interval temp=intervals.get(i);
            if(temp.start>end) break;
            else if(temp.end>end){end=temp.end;i++;break;}
            i++;
        }
        result.add(new Interval(start,end));
        while(i<intervals.size()){result.add(intervals.get(i++));}
        return result;        
    }
}
