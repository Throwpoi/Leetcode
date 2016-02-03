import java.util.*;

public class Symmetric_Tree {
    boolean help(TreeNode left, TreeNode right){
        if(left==null||right==null) return left==right;
        if(left.val!=right.val) return false;
        else return help(left.left,right.right)&&help(left.right,right.left);
    }
    
    public boolean isSymmetric(TreeNode root) {
        if(root==null) return true;
        return help(root.left,root.right);
    }
    
    public boolean isSymmetric1(TreeNode root) {
        if(root==null) return true;
        Queue<TreeNode> left=new LinkedList<TreeNode>();
        Queue<TreeNode> right=new LinkedList<TreeNode>();
        left.offer(root.left);right.offer(root.right);
        while(!left.isEmpty()&&!right.isEmpty()){
            TreeNode a=left.poll(),b=right.poll();
            if(a==null||b==null){
                if(a!=b) return false;
                else continue;
            }
            if(a.val!=b.val) return false;
            left.offer(a.left);left.offer(a.right);
            right.offer(b.right);right.offer(b.left);
        }
        return true;
    }
}
