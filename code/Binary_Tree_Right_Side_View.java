import java.util.*;

public class Binary_Tree_Right_Side_View {
    public List<Integer> rightSideView1(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        rightSideView(root, 0, list);

        return list;
    }

    public void rightSideView(TreeNode root, int level, ArrayList<Integer> list) {
        if(root == null) return;

        if(list.size() == level)
            list.add(root.val);

        rightSideView(root.right, level + 1, list);
        rightSideView(root.left, level + 1, list);
    }
    
    public List<Integer> rightSideView(TreeNode root) {
        Queue<TreeNode> a=new LinkedList<TreeNode>();
        List<Integer> result=new ArrayList<Integer>();
        if(root==null) return result;
        a.offer(root);
        while(!a.isEmpty()){
            TreeNode temp=null;
            Queue<TreeNode> b=new LinkedList<TreeNode>();
            while(!a.isEmpty()){
                temp=a.poll();
                if(temp.left!=null) b.offer(temp.left);
                if(temp.right!=null) b.offer(temp.right);
            }
            result.add(temp.val);
            a=b;
        }
        return result;
    }
}
