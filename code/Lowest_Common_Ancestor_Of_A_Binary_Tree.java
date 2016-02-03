import java.util.*;

public class Lowest_Common_Ancestor_Of_A_Binary_Tree {
    TreeNode help(TreeNode root, TreeNode p, TreeNode q, boolean[] a){
        if(root==null) return null;
        boolean[] temp1=new boolean[2],temp2=new boolean[2];
        TreeNode left=help(root.left,p,q,temp1);
        if(left!=null) return left;
        else{
            if((root==p&&temp1[1])||(root==q&&temp1[0])) return root;
        }
        TreeNode right=help(root.right,p,q,temp2);
        if(right!=null) return right;
        else{
            if((root==p&&temp2[1])||(root==q&&temp2[0])) return root;
        }
        if((temp1[0]&&temp2[1])||(temp1[1]&&temp2[0])) return root;
        a[0]=(root==p||temp1[0]||temp2[0]);a[1]=(root==q||temp1[1]||temp2[1]);
        return null;
    }
    
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        boolean[] a=new boolean[2];
        return help(root,p,q,a);
    }
    
    public TreeNode lowestCommonAncestor1(TreeNode root, TreeNode p, TreeNode q) {
        Queue<TreeNode> a=new LinkedList<TreeNode>();
        Map<TreeNode,TreeNode> b=new HashMap<TreeNode,TreeNode>();
        a.offer(root);b.put(root,null);
        while(!b.containsKey(p)||!b.containsKey(q)){
            TreeNode temp=a.poll();
            if(temp.left!=null){a.offer(temp.left);b.put(temp.left,temp);}
            if(temp.right!=null){a.offer(temp.right);b.put(temp.right,temp);}
        }
        Set<TreeNode> c=new HashSet<TreeNode>();
        while(p!=null){c.add(p);p=b.get(p);}
        while(!c.contains(q)){q=b.get(q);}
        return q;
    }
}
