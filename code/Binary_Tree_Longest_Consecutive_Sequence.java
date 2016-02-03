
public class Binary_Tree_Longest_Consecutive_Sequence {
    public int help(TreeNode root) {
        if(root.left==null&&root.right==null) return 1;
        boolean flag=false;
        int left=Integer.MIN_VALUE,right=Integer.MIN_VALUE;;
        if(root.left!=null){
            left=help(root.left);
            if(left>0&&root.left.val==root.val+1){
                left++;flag=true;
            }
        }
        if(root.right!=null){
            right=help(root.right);
            if(right>0&&root.right.val==root.val+1){
                right++;flag=true;
            }
        }   
        if(left<0) left=-left;
        if(right<0) right=-right;
        int result=Math.max(1,Math.max(left,right));
        if(result>1&&!flag) return -result;
        else return result;
    }
    
    public int longestConsecutive(TreeNode root){
       if(root==null) return 0;
       int result=help(root);
       if(result<0) return -result;
       else return result;
    }
}
