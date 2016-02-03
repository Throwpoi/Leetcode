
public class Construct_Binary_Tree_From_Inorder_And_Postorder_Traversal {
    void help(TreeNode root, int[] postorder, int start1, int end1, int[] inorder, int start2, int end2){
        if(start1>=end1) return;
        int mid=0;
        for(int i=start2;i<=end2;i++){
            if(postorder[end1]==inorder[i]){
                mid=i;break;
            }
        }
        if(start2!=mid){
            root.left=new TreeNode(postorder[start1+mid-start2-1]);
            help(root.left,postorder,start1,start1+mid-start2-1,inorder,start2,mid-1);
        }
        if(end2!=mid){
            root.right=new TreeNode(postorder[end1-1]);
            help(root.right,postorder,end1-end2+mid,end1-1,inorder,mid+1,end2);
        }
    }
    
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int length=postorder.length;
        if(length==0) return null;
        TreeNode root=new TreeNode(postorder[length-1]);
        help(root,postorder,0,length-1,inorder,0,length-1);
        return root;        
    }
}
