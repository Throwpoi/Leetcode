
public class Search_A_2D_Matrix {
    boolean binarySearch(int[] a, int target){
        int start=0, end=a.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(a[mid]==target) return true;
            else if(a[mid]>target) end=mid-1;
            else start=mid+1;
        }        
        return false;
    }
    
    public boolean searchMatrix(int[][] matrix, int target) {
        int length1=matrix.length,length2=matrix[0].length;
        if(target<matrix[0][0]||target>matrix[length1-1][length2-1]) return false;
        int start=0, end=length1-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(matrix[mid][0]==target) return true;
            else if(matrix[mid][0]>target) end=mid-1;
            else start=mid+1;
        }
        int[] a=matrix[end];
        return binarySearch(a,target);
    }
}
