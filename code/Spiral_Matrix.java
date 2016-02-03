import java.util.*;

public class Spiral_Matrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result=new ArrayList<Integer>();
        int m=matrix.length;
        if(m==0) return result;
        int n=matrix[0].length;
        boolean[][] flag=new boolean[m][n];
        int direction=0,x=0,y=0;
        while(x>=0&&y>=0&&x<m&&y<n&&!flag[x][y]){
            flag[x][y]=true;result.add(matrix[x][y]);
            if(direction==0){
                if(y==n-1||flag[x][y+1]){direction=1;x++;}
                else y++;
            }
            else if(direction==1){
                if(x==m-1||flag[x+1][y]){direction=2;y--;}
                else x++;
            }
            else if(direction==2){
                if(y==0||flag[x][y-1]){direction=3;x--;}
                else y--;
            }
            else{
                if(x==0||flag[x-1][y]){direction=0;y++;}
                else x--;
            }
        }
        return result;
    }
}
