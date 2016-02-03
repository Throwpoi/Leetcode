import java.util.*;

public class Binary_Tree_Paths {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result=new ArrayList<String>();
        if(root==null) return result;
        if(root.left==null&&root.right==null){
            String k=""+root.val;
            result.add(k);
            return result;
        }
        if(root.left!=null){
            List<String> left= binaryTreePaths(root.left);
            for(String temp:left){
                String newString=root.val+"->"+temp;
                result.add(newString);
            }
        }
        if(root.right!=null){
            List<String> right= binaryTreePaths(root.right);
            for(String temp:right){
                String newString=root.val+"->"+temp;
                result.add(newString);
            }
        }  
        return result;
    }
}
