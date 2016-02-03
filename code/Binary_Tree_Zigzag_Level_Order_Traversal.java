import java.util.*;

public class Binary_Tree_Zigzag_Level_Order_Traversal {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Stack<TreeNode> a=new Stack<TreeNode>();
        List<List<Integer>> result=new ArrayList<List<Integer>>();
        if(root==null) return result;
        boolean flag=false; a.push(root);
        while(!a.isEmpty()){
            Stack<TreeNode> b=new Stack<TreeNode>();
            List<Integer> temp=new ArrayList<Integer>();
            while(!a.isEmpty()){
                TreeNode k=a.pop();
                if(flag){
                    if(k.right!=null) b.push(k.right);
                    if(k.left!=null) b.push(k.left);
                }
                else{
                    if(k.left!=null) b.push(k.left); 
                    if(k.right!=null) b.push(k.right);
                }
                temp.add(k.val);
            }
            a=b;flag=(flag?false:true);result.add(new ArrayList<Integer>(temp));
        }
        return result;
    }
}
