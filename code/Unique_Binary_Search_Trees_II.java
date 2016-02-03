import java.util.*;

public class Unique_Binary_Search_Trees_II {
    List<TreeNode> help(int start, int end){
        List<TreeNode> result=new ArrayList<TreeNode>();
        for(int i=start;i<=end;i++){
            List<TreeNode> left=help(start,i-1);
            List<TreeNode> right=help(i+1,end);
            int a=left.size(), b=right.size();
            if(a==0&&b==0){TreeNode root=new TreeNode(i);result.add(root);}
            else if(a==0){
                for(TreeNode temp:right){
                    TreeNode root=new TreeNode(i);
                    root.right=temp;result.add(root);
                }
            }
            else if(b==0){
                for(TreeNode temp:left){
                    TreeNode root=new TreeNode(i);
                    root.left=temp;result.add(root);
                }                
            }
            else{
                for(TreeNode temp1:left){
                    for(TreeNode temp2:right){
                        TreeNode root=new TreeNode(i);
                        root.left=temp1;root.right=temp2;result.add(root);
                    }
                }
            }
        }
        return result;
    }
    
    public List<TreeNode> generateTrees(int n) {
        return help(1,n);
    }
}
