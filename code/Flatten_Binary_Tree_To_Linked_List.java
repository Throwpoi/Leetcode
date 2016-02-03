
public class Flatten_Binary_Tree_To_Linked_List {
    TreeNode help(TreeNode root){
        if(root.left==null&&root.right==null) return root;
        if(root.left==null) return help(root.right);
        if(root.right==null){
            root.right=root.left;root.left=null;
            return help(root.right);
        }
        TreeNode right=root.right;
        TreeNode left=help(root.left);
        root.right=root.left;root.left=null;
        left.right=right;
        return help(root.right);
    }
    
    public void flatten(TreeNode root) {
        if(root==null) return;
        help(root);
    }
}
