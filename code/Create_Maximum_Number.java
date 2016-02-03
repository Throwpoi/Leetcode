
public class Create_Maximum_Number {
    public int[] maxNumber(int[] nums1, int[] nums2, int k) {
        int length1=nums1.length,length2=nums2.length;
        long[][][] dp=new long[k+1][length1+1][length2+1];
        for(int i=0;i<=length1;i++){
            for(int j=0;j<=length2;j++){
                int temp=0;
                for(int h=0;h<i;h++){temp=Math.max(temp,nums1[h]);}
                for(int h=0;h<j;h++){temp=Math.max(temp,nums2[h]);}
                dp[1][i][j]=temp;
            }
        }
        for(int h=2;h<=k;h++){
            for(int i=0;i<=length1;i++){
                for(int j=0;j<=length2;j++){
                    if(i+j<h) continue;
                    long temp1=dp[h][i-1][j-1];
                    long temp2=dp[h-1][i-1][j]*10+nums1[i-1];
                    long temp3=dp[h-1][i][j-1]*10+nums2[j-1];
                    long temp4=dp[h-2][i-1][j-1]*100+Math.max(nums1[i-1],nums2[j-1])*10+Math.min(nums1[i-1],nums2[j-1]);
                    dp[h][i][j]=Math.max(Math.max(temp1,temp2),Math.max(temp3,temp4));
                }
            }
        }
        int[] result=new int[k];
        long temp=dp[k][length1][length2];
        int i=0;
        while(temp!=0){
            result[i++]=(int)(temp%10);temp/=10;
        }
        return result;
    }
}
