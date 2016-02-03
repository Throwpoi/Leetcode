
public class Game_Of_Life {
    int help(int[][] board, int i ,int j){
        boolean flag1=i>0,flag2=i<(board.length-1),flag3=j>0,flag4=j<(board[0].length-1);
        int num=0;
        if(flag1){
            num+=(board[i-1][j]==1||board[i-1][j]==2)?1:0;
            if(flag3) num+=(board[i-1][j-1]==1||board[i-1][j-1]==2)?1:0;
            if(flag4) num+=(board[i-1][j+1]==1||board[i-1][j+1]==2)?1:0;
        }
        if(flag2){
            num+=(board[i+1][j]==1||board[i+1][j]==2)?1:0;
            if(flag3) num+=(board[i+1][j-1]==1||board[i+1][j-1]==2)?1:0;
            if(flag4) num+=(board[i+1][j+1]==1||board[i+1][j+1]==2)?1:0;
        }
        if(flag3) num+=(board[i][j-1]==1||board[i][j-1]==2)?1:0;
        if(flag4) num+=(board[i][j+1]==1||board[i][j+1]==2)?1:0;
        return num;
    }
    
    public void gameOfLife(int[][] board) {
        int length1=board.length,length2=board[0].length;
        for(int i=0;i<length1;i++){
            for(int j=0;j<length2;j++){
                if(board[i][j]==1){
                    int num=help(board,i,j);
                    if(num!=2&&num!=3) board[i][j]=2;
                }
                else{
                    int num=help(board,i,j);
                    if(num==3) board[i][j]=3;                    
                }
            }
        }
        for(int i=0;i<length1;i++){
            for(int j=0;j<length2;j++){
                if(board[i][j]==2) board[i][j]=0;
                else if(board[i][j]==3) board[i][j]=1;
            }
        }
    }
}
