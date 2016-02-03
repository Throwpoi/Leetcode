import java.util.Stack;

public class Maximal_Rectangle {
    public int largestRectangleArea(int[] height) {
        Stack<Integer> a=new Stack<Integer>();
        int i=0,max=0;;
        while(i<height.length){
            while(!a.isEmpty()&&height[a.peek()]>height[i]){
                int temp=a.pop();
                if(a.isEmpty()) max=Math.max(max,i*height[temp]);
                else max=Math.max(max,(i-a.peek()-1)*height[temp]);
            }
            a.push(i++);
        }
        while(!a.isEmpty()){
            int temp=a.pop();
            if(a.isEmpty()) max=Math.max(max,i*height[temp]);
            else max=Math.max(max,(i-a.peek()-1)*height[temp]);
        }
        return max;
    }
    
    public int maximalRectangle(char[][] matrix) {
        int max=0, length1=matrix.length;
        if(length1==0) return 0;
        int length2=matrix[0].length;
        if(length2==0) return 0;
        int[][] dp=new int[length1][length2];
        for(int i=0;i<length2;i++) dp[0][i]=matrix[0][i]-'0';
        for(int i=1;i<length1;i++){
            for(int j=0;j<length2;j++){
                if(matrix[i][j]!='0') dp[i][j]=dp[i-1][j]+1;
            }
        }
        for(int i=0;i<length1;i++)
            max=Math.max(max,largestRectangleArea(dp[i]));
        return max;
    }
}
