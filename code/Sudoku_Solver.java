
public class Sudoku_Solver {
    boolean isValid(char[][] board, int a, int b){
		for(int i=0;i<9;i++) 
			if(i!=b&&board[a][b]==board[a][i]) return false;
		for(int i=0;i<9;i++) 
			if(i!=a&&board[a][b]==board[i][b]) return false;
		int a1=a/3*3,b1=b/3*3;
		for(int i=0;i<3;i++)
			for(int j=0;j<3;j++)
				if(!((a1+i)==a&&(b1+j)==b)&&board[a][b]==board[a1+i][b1+j]) return false;
		return true;
	}
	
	boolean help(char[][] board, int a, int b){
		for(int i=b+1;i<9;i++){
			if(board[a][i]!='.') continue;
			for(char k='1';k<='9';k++){
				board[a][i]=k;
				if(isValid(board,a,i)&&help(board,a,i)) return true;
				board[a][i]='.';
			}
			return false;
		}
		for(int i=a+1;i<9;i++){
			for(int j=0;j<9;j++){
				if(board[i][j]!='.') continue;
				for(char k='1';k<='9';k++){
					board[i][j]=k;
					if(isValid(board,i,j)&&help(board,i,j)) return true;
					board[i][j]='.';
				}		
				return false;
			}
		}
		return true;
	}
	
    public void solveSudoku(char[][] board) {
        help(board,0,-1);
    }
}
