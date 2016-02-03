import java.util.Stack;

public class Largest_Rectangle_In_Histogram {
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
}
