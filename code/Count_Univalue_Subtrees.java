
public class Count_Univalue_Subtrees {
    int help1(TreeNode root){
        if(root==null) return 0;
        int num1=help1(root.left),num2=help1(root.right),val=root.val;
        int add=(int)(Math.abs(num1)+Math.abs(num2));
        if((num1==0||(num1>0&&root.left.val==val))&&(num2==0||(num2>0&&root.right.val==val))) return add+1;
        else return -add;
    }
    
    public int countUnivalSubtrees(TreeNode root) {
        return (int)Math.abs(help(root));
    }
    
    int count=0;
    Integer help(TreeNode root){
        if(root.left==null&&root.right==null){count++;return root.val;}
        Integer num1,num2;
        if(root.left==null){
            num2=help(root.right);
            if(num2!=null&&root.val==num2){count++;return num2;}
            else return null;
        }
        else if(root.right==null){
            num1=help(root.left);
            if(num1!=null&&root.val==num1){count++;return num1;}
            else return null;            
        }
        else{
            num1=help(root.left);num2=help(root.right);
            if(num2!=null&&root.val==num2&&num1!=null&&root.val==num1){count++;return root.val;}
            else return null;
        }
    }
    
    public int countUnivalSubtrees1(TreeNode root) {
        if(root==null) return 0;
        help(root);
        return count;
    }
    
    int help(TreeNode root, Integer[] num){
        if(root.left==null&&root.right==null){num[0]=root.val;return 1;}
        Integer[] left=new Integer[1],right=new Integer[1];
        int num1=0,num2=0;
        if(root.left!=null) num1=help(root.left,left);
        if(root.right!=null) num2=help(root.right,right);
        if((root.left==null||(left[0]!=null&&root.val==left[0]))&&
            (root.right==null||(right[0]!=null&&root.val==right[0]))) num[0]=root.val;
        else num[0]=null;
        return num1+num2+(num[0]==null?0:1);
    }
    
    public int countUnivalSubtrees2(TreeNode root) {
        Integer[] num=new Integer[1];
        if(root==null) return 0;
        else return help(root,num);
    }
}
