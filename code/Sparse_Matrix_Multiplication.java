import java.util.*;

public class Sparse_Matrix_Multiplication {
    public int[][] multiply(int[][] A, int[][] B) {
        int length1=A.length,length2=B[0].length,length=B.length;
        List<List<Integer>> a=new ArrayList<List<Integer>>();
        for(int i=0;i<length1;i++){
            List<Integer> temp=new ArrayList<Integer>();
            for(int j=0;j<length;j++){
                if(A[i][j]!=0)temp.add(i*length+j);
            }
            a.add(new ArrayList<Integer>(temp));
        }
        Iterator<List<Integer>> iterator=a.iterator();
        int[][] result=new int[length1][length2];
        for(int i=0;i<length1;i++){
            List<Integer> temp=iterator.next();
            for(int j=0;j<length2;j++){
                int temp1=0;
                Iterator<Integer> iterator2=temp.iterator();
                while(iterator2.hasNext()){
                    int index=iterator2.next();
                    int k=index-index/length*length;
                    temp1+=A[i][k]*B[k][j];
                }
                result[i][j]=temp1;
            }
        }
        return result;
    }
}
