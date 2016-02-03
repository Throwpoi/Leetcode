
public class Spiral_Matrix_II {
    public int[][] generateMatrix(int n) {
        int[][] result=new int[n][n];
        int direction=0,x=0,y=0,temp=1;
        while(x>=0&&y>=0&&x<n&&y<n&&result[x][y]==0){
            result[x][y]=temp++;
            if(direction==0){
                if(y==n-1||result[x][y+1]!=0){direction=1;x++;}
                else y++;
            }
            else if(direction==1){
                if(x==n-1||result[x+1][y]!=0){direction=2;y--;}
                else x++;
            }
            else if(direction==2){
                if(y==0||result[x][y-1]!=0){direction=3;x--;}
                else y--;
            }
            else{
                if(x==0||result[x-1][y]!=0){direction=0;y++;}
                else x--;
            }
        }
        return result;        
    }
}
