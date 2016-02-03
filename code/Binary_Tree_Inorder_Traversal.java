import java.util.*;
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class Binary_Tree_Inorder_Traversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> output=new ArrayList<Integer>();
        if(root==null) return output;
        Stack<TreeNode> a=new Stack<TreeNode>();
        Set<TreeNode> b=new HashSet<TreeNode>();
        a.push(root);
        while(!a.isEmpty()){
        	TreeNode temp=a.pop();
        	if(b.contains(temp)) output.add(temp.val);
        	else{
        		if(temp.right!=null) a.push(temp.right);	
        		a.push(temp);b.add(temp);
        		if(temp.left!=null) a.push(temp.left);
        	}
        }
        return output; 
    }
}
