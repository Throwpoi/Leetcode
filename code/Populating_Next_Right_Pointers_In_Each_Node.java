import java.util.*;

class TreeLinkNode {
    int val;
    TreeLinkNode left, right, next;
    TreeLinkNode(int x) { val = x; }
}

public class Populating_Next_Right_Pointers_In_Each_Node {
    public void connect1(TreeLinkNode root) {
        Queue<TreeLinkNode> a=new LinkedList<TreeLinkNode>();
        if(root==null) return;
        a.offer(root);
        boolean flag=true;
        while(!a.isEmpty()){
            Queue<TreeLinkNode> b=new LinkedList<TreeLinkNode>();
            TreeLinkNode head=a.poll();
            if(head.left!=null){
                b.offer(head.left);
                b.offer(head.right);
            }
            else flag=false;
            while(!a.isEmpty()){
                TreeLinkNode temp=a.poll();
                head.next=temp;
                head=temp;
                if(flag){
                    b.offer(head.left);
                    b.offer(head.right);
                }
            }
            a=b;
        }
    }
    
    void help(TreeLinkNode root, TreeLinkNode next){
        root.next=next;
        if(root.left==null) return;
        help(root.left,root.right);
        help(root.right,(next==null)?null:next.left);
    }
    
    public void connect(TreeLinkNode root) {
        if(root==null) return;
        help(root,null);
    }
}
