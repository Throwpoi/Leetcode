import java.util.*;

public class Three_Sum_Smaller {
    public int threeSumSmaller1(int[] nums, int target) {
        Arrays.sort(nums);
        int length=nums.length;
        if(length==0) return 0;
        int result=0;
        for(int i=0;i<length-2;i++){
            int goal=target-nums[i];
            int start=i+1,end=length-1;
            while(start<end){
                int temp=nums[start]+nums[end];
                if(temp>=goal){
                    end--;
                }
                else{
                    result+=(end-start);
                    start++;
                }
            }
        }
        return result;
    }
    
    public static int threeSumSmaller(int[] nums, int target) {
        Arrays.sort(nums);
        int length=nums.length;
        if(length==0) return 0;
        int[][] dp=new int[length][length];
        for(int i=0;i<length;i++){
            for(int j=i;j<length;j++){
                if(i==j) dp[i][j]=1;
                else dp[i][j]=((nums[j]==nums[j-1])?0:1)+dp[i][j-1];
            }
        }
        int result=0;
        for(int i=0;i<length-2;i++){
            if(i!=0&&nums[i]==nums[i-1]) continue;
            int goal=target-nums[i];
            int start=i+1,end=length-1;
            System.out.println("start="+start);
            System.out.println("end="+end);
            while(start<end){
                int temp=nums[start]+nums[end];
                if(temp>=goal){
                    while(end>start&&nums[end-1]==nums[end]){end--;}
                    end--;
                }
                else{
                    result+=dp[start+1][end];
                    System.out.println(dp[start+1][end]);
                    while(start<end&&nums[start+1]==nums[start]){start++;}
                    start++;
                }
            }
        }
        return result;
    }
    
    public static void main(String[] args){
    	int[] nums={1,-2,2,1,0};
    	threeSumSmaller(nums,1);
    }
}
