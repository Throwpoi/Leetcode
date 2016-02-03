import java.util.*;

public class N_Queens {
    boolean[] row;
    boolean[] col;
    boolean[] left;
    boolean[] right;
    
    void help(int start,List<List<String>> result, List<String> temp, int n){
        if(start==n){
            result.add(new ArrayList<String>(temp));
            return;
        }
        for(int i=0;i<n;i++){
            if(!col[i]&&!left[n-1-start+i]&&!right[2*(n-1)-i-start]){
                StringBuilder a=new StringBuilder();int k=0;
                while(k<i){a.append('.');k++;}
                a.append('Q');k++;
                while(k<n){a.append('.');k++;}
                temp.add(a.toString());
                col[i]=left[n-1-start+i]=right[2*(n-1)-i-start]=true;
                help(start+1,result,temp,n);
                temp.remove(temp.size()-1);
                col[i]=left[n-1-start+i]=right[2*(n-1)-i-start]=false;
            }
        }
    }
    
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> result=new ArrayList<List<String>>();
        List<String> temp=new ArrayList<String>();
        row=new boolean[n];
        col=new boolean[n];
        left=new boolean[2*n-1];
        right=new boolean[2*n-1];
        help(0,result,temp,n);
        return result;
    }
}
