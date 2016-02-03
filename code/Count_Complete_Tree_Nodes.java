
public class Count_Complete_Tree_Nodes {
    boolean binarySearch(TreeNode root,int[] a){
        TreeNode temp=root;int i=0,j=0;
        while(temp!=null){temp=temp.left;i++;}
        temp=root;
        while(temp!=null){temp=temp.right;j++;}
        a[0]=i;
        return i==j;
    }
    
    int help(TreeNode root){
        if(root.left==null&&root.right==null) return 1;
        int[] a=new int[1];
        boolean flag=binarySearch(root.left,a);
        if(flag) return (1<<a[0])+(root.right==null?0:help(root.right));
        else return (1<<(a[0]-1))+help(root.left);
    }
    
    public int countNodes(TreeNode root) {
        if(root==null) return 0;
        return help(root);
    }
}
