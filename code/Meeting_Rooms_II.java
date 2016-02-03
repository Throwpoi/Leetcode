import java.util.*;

public class Meeting_Rooms_II {
    public int minMeetingRooms(Interval[] intervals) {
        int max=0,temp=1;
        int length=intervals.length;
        int[] start=new int[length], end=new int[length];
        for(int i=0;i<length;i++){
            start[i]=intervals[i].start;
            end[i]=intervals[i].end;
        }
        Arrays.sort(start);Arrays.sort(end);
        int i=0,j=0;
        while(i<length){
            temp--;
            int newEnd=end[j++];
            while(i<length&&start[i]<newEnd){i++;temp++;}
            max=Math.max(max,temp);
        }
        return max;
    }
}
