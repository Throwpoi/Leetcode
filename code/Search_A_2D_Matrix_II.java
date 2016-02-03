
public class Search_A_2D_Matrix_II {
    boolean binarySearch(int[]matrix, int target){
        int start=0,end=matrix.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            int temp=matrix[mid];
            if(temp==target) return true;
            else if(temp<target) start=mid+1;
            else end=mid-1;
        }
        return false;
    }
    
    public boolean searchMatrix(int[][] matrix, int target) {
        int length1=matrix.length;
        if(length1==0) return false;
        int length2=matrix[0].length;
        if(length2==0) return false;     
        if(target<matrix[0][0]||target>matrix[length1-1][length2-1]) return false;
        int a=0,b=0;
        int start=0,end=length1-1;
        while(start<=end){
            int mid=(start+end)/2;
            int temp=matrix[mid][0];
            if(temp==target) return true;
            else if(temp<target) start=mid+1;
            else end=mid-1;
        }
        a=end;start=0;end=length1-1;
        while(start<=end){
            int mid=(start+end)/2;
            int temp=matrix[mid][length2-1];
            if(temp==target) return true;
            else if(temp<target) start=mid+1;
            else end=mid-1;
        }
        b=end;
        if(a<b+1) return false;
        for(int i=b+1;i<=a;i++){
            if(binarySearch(matrix[i],target)) return true;
        }
        return false;
    }
}
