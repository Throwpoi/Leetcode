
public class Construct_Binary_Tree_From_Preorder_And_Inorder_Traversal {
    void help(TreeNode root, int[] preorder, int start1, int end1, int[] inorder, int start2, int end2){
        if(start1>=end1) return;
        int mid=0;
        for(int i=start2;i<=end2;i++){
            if(preorder[start1]==inorder[i]){
                mid=i;break;
            }
        }
        if(start2!=mid){
            root.left=new TreeNode(preorder[start1+1]);
            help(root.left,preorder,start1+1,start1+mid-start2,inorder,start2,mid-1);
        }
        if(end2!=mid){
            root.right=new TreeNode(preorder[start1+mid-start2+1]);
            help(root.right,preorder,start1+mid-start2+1,end1,inorder,mid+1,end2);
        }
    }
    
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int length=preorder.length;
        if(length==0) return null;
        TreeNode root=new TreeNode(preorder[0]);
        help(root,preorder,0,length-1,inorder,0,length-1);
        return root;
    }
}
