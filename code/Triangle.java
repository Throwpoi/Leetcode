import java.util.*;

public class Triangle {
    public int minimumTotal(List<List<Integer>> triangle) {
        int size=triangle.size(),min=Integer.MAX_VALUE;
        int[] a=new int[size];
        a[0]=triangle.get(0).get(0);
        for(int i=1;i<size;i++){
            int[] b=new int[size];
            for(int j=0;j<i+1;j++){
                if(j==0) b[j]=a[j]+triangle.get(i).get(j);
                else if(j==i) b[j]=a[j-1]+triangle.get(i).get(j);
                else b[j]=Math.min(a[j],a[j-1])+triangle.get(i).get(j);
            }
            a=b;
        }
        for(int i=0;i<size;i++) min=Math.min(min,a[i]);
        return min;
    }
}
