import java.util.*;

public class Word_Search_II {
    void dfs(boolean[][] flag, char[][] board, int i, int j,Implement_Trie newTree,StringBuilder temp, Set<String> output){
        if(i<0||j<0||i>=board.length||j>=board[0].length||flag[i][j]) return;
        temp.append(board[i][j]);
        if(!newTree.startsWith(temp.toString())){temp.deleteCharAt(temp.length()-1);return;}
        if(newTree.search(temp.toString())){String k=temp.toString();output.add(k);}
        flag[i][j]=true;
        dfs(flag,board,i+1,j,newTree,temp,output);
        dfs(flag,board,i-1,j,newTree,temp,output);
        dfs(flag,board,i,j+1,newTree,temp,output);
        dfs(flag,board,i,j-1,newTree,temp,output);
        flag[i][j]=false;
        temp.deleteCharAt(temp.length()-1);
    }
    
    public List<String> findWords(char[][] board, String[] words) {
    	Implement_Trie newTree=new Implement_Trie();
        for(int i=0;i<words.length;i++) newTree.insert(words[i]);
        boolean[][] flag=new boolean[board.length][board[0].length];
        List<String> result=new ArrayList<String>();
        Set<String> output=new HashSet<String>();
        StringBuilder temp=new StringBuilder();
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                dfs(flag,board,i,j,newTree,temp,output);
            }
        }
        for(String h:output) result.add(h);
        return result;
    }
}
