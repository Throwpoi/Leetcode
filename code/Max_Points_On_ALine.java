import java.util.*;

class Point {
    int x;
    int y;
    Point() { x = 0; y = 0; }
    Point(int a, int b) { x = a; y = b; }
}

public class Max_Points_On_ALine {
    public int maxPoints(Point[] points) {
        int max=0;
        Map<Double,Integer> a=new HashMap<Double,Integer>();
        Set<Point> b=new HashSet<Point>();
        for(Point i:points) b.add(i);
        for(int i=0;i<points.length;i++){
            if(b.isEmpty()) break;
            Point temp1=points[i];
            if(!b.contains(temp1)) continue;
            b.remove(temp1);
            int infinite=1,max1=1,duplicate=0;
            for(int j=i+1;j<points.length;j++){
                Point temp2=points[j];
                if(!b.contains(temp2)) continue;
                double dy=temp2.y-temp1.y, dx=temp2.x-temp1.x;
                if(dx==0&&dy==0){
                    duplicate++;b.remove(temp2);continue;
                }
                if(dx==0) infinite++;
                else{
                    double k=dy==0?0:dy/dx;
                    if(!a.containsKey(k)) a.put(k,2);
                    else a.put(k,a.get(k)+1);
                    max1=Math.max(max1,a.get(k));
                }
            }
            max=Math.max(max,Math.max(infinite,max1)+duplicate);
            a.clear();
        }
        return max;
    }
}
