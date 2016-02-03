
public class Sum_Root_To_Leaf_Numbers {
    void help(int[] sum, TreeNode root, int temp){
        temp=temp*10+root.val;
        if(root.left==null&&root.right==null){
            sum[0]+=temp;
            return;
        }
        if(root.left!=null) help(sum,root.left,temp);
        if(root.right!=null) help(sum,root.right,temp);
    }
    
    public int sumNumbers(TreeNode root) {
        if(root==null) return 0;
        int[] sum=new int[1];
        help(sum,root,0);
        return sum[0];
    }
}
