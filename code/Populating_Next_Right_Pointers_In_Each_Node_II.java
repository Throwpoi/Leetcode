import java.util.*;

public class Populating_Next_Right_Pointers_In_Each_Node_II {
    public void connect(TreeLinkNode root) {
        Queue<TreeLinkNode> a=new LinkedList<TreeLinkNode>();
        if(root==null) return;
        a.offer(root);
        while(!a.isEmpty()){
            Queue<TreeLinkNode> b=new LinkedList<TreeLinkNode>();
            TreeLinkNode head=a.poll();
            if(head.left!=null) b.offer(head.left);
            if(head.right!=null) b.offer(head.right);
            while(!a.isEmpty()){
                TreeLinkNode temp=a.poll();
                head.next=temp;
                head=temp;
                if(head.left!=null) b.offer(head.left);
                if(head.right!=null) b.offer(head.right);
            }
            a=b;
        }        
    }
}
