
public class Path_Sum {
    public boolean hasPathSum1(TreeNode root, int sum){
        if(root.right==null&&root.left==null){
            if(sum==root.val) return true;
            else return false;
        }
        return (root.left==null?false:hasPathSum1(root.left,sum-root.val))||
                 (root.right==null?false:hasPathSum1(root.right,sum-root.val));
    }
    
    public boolean hasPathSum(TreeNode root, int sum){
        if(root==null) return false;
        return hasPathSum1(root,sum);
    }
}
