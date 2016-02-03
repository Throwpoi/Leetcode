import java.util.*;

public class Valid_Sudoku {
    public boolean isValidSudoku(char[][] board) {
    	boolean[][] row=new boolean[9][9];
    	boolean[][] col=new boolean[9][9];
    	boolean[][] area=new boolean[9][9];
    	for(int i=0;i<board.length;i++){
    		for(int j=0;j<board[0].length;j++){
    			if(board[i][j]=='.') continue;
    			int k=board[i][j]-'0'-1,t=(int)Math.sqrt(board.length);
    			if(row[i][k]||col[j][k]||area[t*(i/t)+j/t][k]) return false;
    			row[i][k]=col[j][k]=area[t*(i/t)+j/t][k]=true;
    		}
    	}
    	return true;  
    }
}
