
public class Balanced_Binary_Tree {
    boolean help(TreeNode root, int[] a){
        if(root==null) return true;
        int[] left=new int[1],right=new int[1];
        boolean flag1=help(root.left,left), flag2=help(root.right,right);
        a[0]=Math.max(left[0],right[0])+1;
        return flag1&&flag2&&(Math.abs(left[0]-right[0])<=1);
    }
    
    public boolean isBalanced(TreeNode root) {
        int[] a=new int[1];
        return help(root,a);
    }
}
