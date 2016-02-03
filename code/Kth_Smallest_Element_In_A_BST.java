
public class Kth_Smallest_Element_In_A_BST {
    int size(TreeNode root){
        if(root==null) return 0;
        return 1+size(root.left)+size(root.right);
    }
    
    public int kthSmallest(TreeNode root, int k) {
        int left=size(root.left);
        if(left==(k-1)) return root.val;
        else if(left>(k-1)) return kthSmallest(root.left,k);
        else return kthSmallest(root.right,k-1-left);
    }
}
