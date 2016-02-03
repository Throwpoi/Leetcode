
public class Paint_House {
    public int minCost(int[][] costs) {
        int length=costs.length;
        if(length==0) return 0;
        int[] r=new int[length];
        int[] g=new int[length];
        int[] b=new int[length];
        r[0]=costs[0][0];g[0]=costs[0][1];b[0]=costs[0][2];
        for(int i=1;i<length;i++){
            r[i]=Math.min(g[i-1],b[i-1])+costs[i][0];
            g[i]=Math.min(r[i-1],b[i-1])+costs[i][1];
            b[i]=Math.min(r[i-1],g[i-1])+costs[i][2];
        }
        return Math.min(Math.min(r[length-1],g[length-1]),b[length-1]);
    }
}
