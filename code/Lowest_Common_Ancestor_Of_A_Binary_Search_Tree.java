
public class Lowest_Common_Ancestor_Of_A_Binary_Search_Tree {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        int a=root.val,b=p.val,c=q.val;
        if((a>=b&&a<=c)||(a<=b&&a>=c)) return root;
        else if(a>b&&a>c) return lowestCommonAncestor(root.left,p,q);
        else return lowestCommonAncestor(root.right,p,q);
    }
}
