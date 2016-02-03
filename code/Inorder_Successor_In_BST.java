import java.util.*;
public class Inorder_Successor_In_BST {
    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        if(p.right!=null){
            TreeNode temp=p.right;
            while(temp.left!=null){
                temp=temp.left;
            }
            return temp;
        }
        else{
            Map<TreeNode,TreeNode> a=new HashMap<TreeNode,TreeNode>();
            TreeNode last=null,temp=root;
            while(true){
                a.put(temp,last);
                last=temp;
                if(temp==p) break;
                else if(temp.val>p.val) temp=temp.left;
                else temp=temp.right;
            }
            temp=p;
            while(true){
                last=a.get(temp);
                if(last==null) break;
                if(last.left==temp) return last;
                else temp=last;
            }
            return null;
        }
    }
    
    public TreeNode inorderSuccessor1(TreeNode root, TreeNode p) {
        TreeNode res = null;
        while(root!=null) {
            if(root.val > p.val) {
                res = root;
                root = root.left;
            }
            else root = root.right;
        }
        return res;
    }
    
    public static void main(String[] args){
    	TreeNode a=new TreeNode(2);
    	TreeNode b=new TreeNode(3);
    	a.right=b;
    	
    }
}
