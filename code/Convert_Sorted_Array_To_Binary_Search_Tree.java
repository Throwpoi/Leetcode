
public class Convert_Sorted_Array_To_Binary_Search_Tree {
    void help(TreeNode root, int[] nums, int start, int end){
        if(start>end) return;
        int mid=(start+end)/2;
        root.val=nums[mid];
        if(start!=mid){
            TreeNode left=new TreeNode(0);
            root.left=left;
            help(left,nums,start,mid-1);
        }
        if(end!=mid){
            TreeNode right=new TreeNode(0);
            root.right=right;
            help(right,nums,mid+1,end);
        }
    }
    
    public TreeNode sortedArrayToBST(int[] nums) {
        int length=nums.length;
        if(length==0) return null;
        TreeNode root=new TreeNode(0);
        help(root,nums,0,length-1);
        return root;
    }
}
