import java.util.*;

public class Serialize_And_Deserialize_Binary_Tree {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder result=new StringBuilder(); 
        Queue<TreeNode> a=new LinkedList<TreeNode>();
        a.offer(root);
        while(!a.isEmpty()){
            TreeNode temp=a.poll();
            if(temp==null) result.append(" ,");
            else{
                result.append(String.valueOf(temp.val)+",");
                a.offer(temp.left);a.offer(temp.right);
            }
        }
        int i=result.length()-1;
        while(i>=0&&(result.charAt(i)==' '||result.charAt(i)==',')) result.deleteCharAt(i--);
        return result.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data.length()==0) return null;
        Queue<TreeNode> a=new LinkedList<TreeNode>();
        String[] temp=data.split("\\,");
        int length=temp.length,i=1;
        TreeNode root=new TreeNode(Integer.parseInt(temp[0]));
        a.offer(root);
        while(i<length){
            TreeNode k=a.poll();
            if(!temp[i].equals(" ")){
                TreeNode newNode=new TreeNode(Integer.parseInt(temp[i]));
                k.left=newNode;a.offer(newNode);
            }
            if(i+1<length&&!temp[i+1].equals(" ")){
                TreeNode newNode=new TreeNode(Integer.parseInt(temp[i+1]));
                k.right=newNode;a.offer(newNode);
            } 
            i+=2;
        }
        return root;
    }
}
