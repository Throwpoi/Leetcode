import java.util.Arrays;

public class Paint_House_II {
    public static int minCostII(int[][] costs) {
        int length1=costs.length;
        if(length1==0) return 0;
        int length2=costs[0].length;
        if(length2==0) return 0;
        int[][] dp=new int[length1][length2];
        int[] left=new int[length2];
        int[] right=new int[length2];
        left[0]=Integer.MAX_VALUE;
        right[length2-1]=Integer.MAX_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<length2;i++){
            dp[0][i]=costs[0][i];
            min=Math.min(min,dp[0][i]);
            if(i<length2-1)left[i+1]=min;
        }
        min=Integer.MAX_VALUE;
        for(int i=length2-1;i>=0;i--){
            min=Math.min(min,dp[0][i]);
            if(i>0)right[i-1]=min;
        }    
        for(int i=1;i<length1;i++){
            int[] left1=new int[length2];
            int[] right1=new int[length2];
            left1[0]=Integer.MAX_VALUE;
            right1[length2-1]=Integer.MAX_VALUE;
            min=Integer.MAX_VALUE;
            for(int j=0;j<length2;j++){
                dp[i][j]=Math.min(left[j],right[j])+costs[i][j];
                min=Math.min(min,dp[i][j]);
                if(j<length2-1)left1[j+1]=min;
            }
            min=Integer.MAX_VALUE;
            for(int j=length2-1;j>=0;j--){
                min=Math.min(min,dp[i][j]);
                if(j>0)right1[j-1]=min;
            }   
            left=left1;right=right1;
        }
        return min;
    }
    
    public static void main(String[] args){
    	int[][] costs={
    		{1,5,3},{2,9,4}	
    	};
    	minCostII(costs);
    }
}
