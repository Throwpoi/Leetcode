public class Solution {
    /*
      end    start
      TreeMap (start,index)
    */
    public int[] findRightInterval(Interval[] intervals) {
        int length=intervals.length;
        int[] result=new int[length];
        if(length==0){
            return result;
        }
        TreeMap<Integer,Integer> map=new TreeMap<Integer,Integer>();
        for(int i=0;i<length;i++){
            map.put(intervals[i].start,i);
        }
        for(int i=0;i<length;i++){
            Integer right=map.ceilingKey(intervals[i].end);
            result[i]=(right==null?-1:map.get(right));
        }
        return result;
    }
}
