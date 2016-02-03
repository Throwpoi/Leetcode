
public class Invert_Binary_Tree {
    void help(TreeNode root){
        TreeNode temp=root.left;
        root.left=root.right;root.right=temp;
        if(root.left!=null) invertTree(root.left);
        if(root.right!=null) invertTree(root.right); 
    }
    
    public TreeNode invertTree(TreeNode root) {
        if(root==null) return null;
        help(root);return root;
    }
}
