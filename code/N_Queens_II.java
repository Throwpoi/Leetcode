
public class N_Queens_II {
    boolean[] row;
    boolean[] col;
    boolean[] left;
    boolean[] right;
    
    int help(int start, int n){
        if(start==n) return 1;
        int add=0;
        for(int i=0;i<n;i++){
            if(!col[i]&&!left[n-1-start+i]&&!right[2*(n-1)-start-i]){
                col[i]=left[n-1-start+i]=right[2*(n-1)-start-i]=true;
                add+=help(start+1,n);
                col[i]=left[n-1-start+i]=right[2*(n-1)-start-i]=false;
            }
        }
        return add;
    }
    
    public int totalNQueens(int n) {
        row=new boolean[n];
        col=new boolean[n];
        left=new boolean[2*n-1];
        right=new boolean[2*n-1]; 
        return help(0,n);
    }
}
