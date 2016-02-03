import java.util.*;

public class Binary_Tree_Preorder_Traversal {
    public List<Integer> preorderTraversal(TreeNode root) {
        Stack<TreeNode> a=new Stack<TreeNode>();
        List<Integer> result=new ArrayList<Integer>();
        if(root==null) return result;
        a.push(root);
        while(!a.isEmpty()){
            TreeNode temp=a.pop();
            result.add(temp.val);
            if(temp.right!=null) a.push(temp.right);
            if(temp.left!=null) a.push(temp.left);
        }
        return result;
    }
}
