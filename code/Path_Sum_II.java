import java.util.*;

public class Path_Sum_II {
    void help(TreeNode root, int sum, List<Integer> temp, List<List<Integer>> result){
        if(root.left==null&&root.right==null){
            if(sum==root.val){
                temp.add(root.val);
                result.add(new ArrayList<Integer>(temp));
                temp.remove(temp.size()-1);
            }
            return;
        }
        temp.add(root.val);
        if(root.left!=null) help(root.left,sum-root.val,temp,result);
        if(root.right!=null) help(root.right,sum-root.val,temp,result);
        temp.remove(temp.size()-1);
    }
    
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> result=new ArrayList<List<Integer>>();
        List<Integer> temp=new ArrayList<Integer>();
        if(root==null) return result;
        help(root,sum,temp,result);
        return result;
    }
}
