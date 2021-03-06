import java.util.*;

public class Binary_Tree_Level_Order_Traversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> a=new LinkedList<TreeNode>();
        List<List<Integer>> result=new ArrayList<List<Integer>>();
        if(root==null) return result;
        a.offer(root);
        while(!a.isEmpty()){
            Queue<TreeNode> b=new LinkedList<TreeNode>();
            List<Integer> temp=new ArrayList<Integer>();
            while(!a.isEmpty()){
                TreeNode k=a.poll();
                if(k.left!=null) b.offer(k.left);
                if(k.right!=null) b.offer(k.right);
                temp.add(k.val);
            }
            result.add(new ArrayList<Integer>(temp));
            a=b;
        }
        return result;        
    }
}
