
public class Set_Matrix_Zeroes {
    public void setZeroes(int[][] matrix) {
        int length1=matrix.length,length2=matrix[0].length;
        boolean flag1=false;
        for(int i=0;i<length2;i++)
            if(matrix[0][i]==0){flag1=true;break;}
        for(int i=1;i<length1;i++){
            for(int j=0;j<length2;j++)
                if(matrix[i][j]==0){matrix[0][j]=0;matrix[i][0]=0;}
            if(matrix[i][0]==0)
                for(int j=0;j<length2;j++)
                    matrix[i][j]=0;
        }
        for(int i=0;i<length2;i++)
            if(matrix[0][i]==0)
                for(int j=0;j<length1;j++)
                    matrix[j][i]=0;
        if(flag1)
            for(int i=0;i<length2;i++)
                matrix[0][i]=0;
    }
}
