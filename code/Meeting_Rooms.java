import java.util.*;

public class Meeting_Rooms {
    public boolean canAttendMeetings(Interval[] intervals) {
        List<Interval> a=new ArrayList<Interval>();
        for(Interval temp:intervals){
            a.add(temp);
        }
        Collections.sort(a,new Comparator<Interval>(){
            public int compare(Interval a, Interval b){
                if(a.start>b.start) return 1;
                else if(a.start<b.start) return -1;
                else{
                    if(a.end>b.end) return 1;
                    else if(a.end>b.end) return -1;
                    else return 0;
                }
            }
        });
        for(int i=0;i<a.size()-1;i++){
            if(a.get(i).end>a.get(i+1).start) return false;
        }
        return true;
    }
}
