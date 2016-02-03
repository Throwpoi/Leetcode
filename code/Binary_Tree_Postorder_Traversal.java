import java.util.*;

public class Binary_Tree_Postorder_Traversal {
    public List<Integer> postorderTraversal(TreeNode root) {
        Stack<TreeNode> a=new Stack<TreeNode>();
        List<Integer> result=new ArrayList<Integer>();
        if(root==null) return result;
        a.push(root);
        while(!a.isEmpty()){
            TreeNode temp=a.pop();
            if(temp.left==null&&temp.right==null) result.add(temp.val);
            else{
                a.push(new TreeNode(temp.val));
                if(temp.right!=null) a.push(temp.right);
                if(temp.left!=null) a.push(temp.left);
            }
        }
        return result;
    }
}
