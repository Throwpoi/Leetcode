
public class Rotate_Image {
    public void rotate(int[][] matrix) {
        int length=matrix.length;
        for(int i=0;i<length/2;i++){
            int start=i,end=length-1-i;
            for(int j=0;j<end-start;j++){
                int temp=matrix[start][start+j];
                matrix[start][start+j]=matrix[end-j][start];
                matrix[end-j][start]=matrix[end][end-j];
                matrix[end][end-j]=matrix[start+j][end];
                matrix[start+j][end]=temp;
            }
        }
    }
}
