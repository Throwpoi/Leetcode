import java.util.*;

class Node4{
    int i;
    int j;
    public Node4(int i, int j){this.i=i;this.j=j;}
}

public class Number_Of_Islands {
    boolean isIsland(int i, int j, char[][] grid, boolean[][] flag){
        if(i<0||j<0||i>=grid.length||j>=grid[0].length||grid[i][j]=='0'||flag[i][j]) return false;
        else return true;
    }
    
    void bfs(char[][] grid, int i, int j, boolean[][] flag){
        Queue<Node4> a=new LinkedList<Node4>();
        a.offer(new Node4(i,j));flag[i][j]=true;
        while(!a.isEmpty()){
             Queue<Node4> b=new LinkedList<Node4>();
             while(!a.isEmpty()){
                 Node4 temp=a.poll();
                 int x=temp.i,y=temp.j;
                 if(isIsland(x+1,y,grid,flag)){b.offer(new Node4(x+1,y));flag[x+1][y]=true;}
                 if(isIsland(x-1,y,grid,flag)){b.offer(new Node4(x-1,y));flag[x-1][y]=true;}
                 if(isIsland(x,y+1,grid,flag)){b.offer(new Node4(x,y+1));flag[x][y+1]=true;}
                 if(isIsland(x,y-1,grid,flag)){b.offer(new Node4(x,y-1));flag[x][y-1]=true;}
             }
             a=b;
        }
    }
    
    public int numIslands(char[][] grid) {
        int result=0;
        int length1=grid.length;if(length1==0) return result;
        int length2=grid[0].length;if(length2==0) return result;
        boolean[][] flag=new boolean[length1][length2];
        for(int i=0;i<length1;i++){
            for(int j=0;j<length2;j++){
                if(grid[i][j]=='0'||flag[i][j]) continue;
                else{
                    result++;bfs(grid,i,j,flag);
                }
            }
        }
        return result;
    }
}
