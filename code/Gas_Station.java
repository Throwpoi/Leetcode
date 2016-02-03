
public class Gas_Station {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int length=gas.length,start=0,i=0,total=0;
        while(start<length){
            if(total+gas[i]-cost[i]>=0){
                total+=(gas[i]-cost[i]);
                if(i==length-1) i=0;
                else i++;
                if(i==start) return start;
            }
            else{
                if(i<start) return -1;
                else{start=i+1;total=0;i++;}
            }
        }
        return -1;
    }
}
