
public class Binary_Tree_Maximum_Path_Sum {
    int help(TreeNode root, int[] length){
        if(root==null) return Integer.MIN_VALUE;
        int[] length1=new int[1], length2=new int[1];
        int a=help(root.left,length1), b=help(root.right,length2);
        length[0]=Math.max(0,Math.max(length1[0],length2[0]))+root.val;
        return Math.max(Math.max(a,b),root.val+(length1[0]>0?length1[0]:0)+(length2[0]>0?length2[0]:0));
    }
    
    public int maxPathSum(TreeNode root) {
        int[] length=new int[1];
        return help(root,length);
    }
}
