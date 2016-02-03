
public class Validate_Binary_Search_Tree {
    boolean help(TreeNode root, Integer start, Integer end){
        int val=root.val;
        if((start!=null&&val<=start)||(end!=null&&val>=end)) return false;
        return (root.left==null?true:help(root.left,start,val))&&(root.right==null?true:help(root.right,val,end));
    }
    
    public boolean isValidBST(TreeNode root) {
        if(root==null) return true;
        return help(root,null, null);
    }
}
