import java.util.*;
class Node{
    int i; int j;
    public Node(int i, int j){this.i=i;this.j=j;}
}

public class Surrounded_Regions {
    void bfs(int i, int j, char[][] board){
        Queue<Node> store=new LinkedList<Node>();
        Node newNode=new Node(i,j);
        store.offer(newNode);
        while(!store.isEmpty()){
            Queue<Node> newStore=new LinkedList<Node>();
            while(!store.isEmpty()){
                Node temp=store.poll();
                int a=temp.i, b=temp.j; 
                if(judge(a,b,board)){
                    board[a][b]='.';
                    newStore.offer(new Node(a+1,b));newStore.offer(new Node(a-1,b));
                    newStore.offer(new Node(a,b+1));newStore.offer(new Node(a,b-1));
                }
            }
            store=newStore;
        }
    }
    
    boolean judge(int i, int j, char[][] board){
        if(i<0||j<0||i>=board.length||j>=board[0].length||board[i][j]=='.'||board[i][j]=='X') return false;
        else return true;
    }
    
    public void solve(char[][] board) {
        int length1=board.length;
        if(length1==0) return;
        int length2=board[0].length;
        if(length2==0) return;
        for(int i=0;i<length1;i++){
            bfs(i,0,board);bfs(i,length2-1,board);
        }
        for(int i=0;i<length2;i++){
            bfs(0,i,board);bfs(length1-1,i,board);
        }     
        for(int i=0;i<length1;i++){
            for(int j=0;j<length2;j++){
                if(board[i][j]=='O') board[i][j]='X';
                if(board[i][j]=='.') board[i][j]='O';
            }
        }
    }
}
