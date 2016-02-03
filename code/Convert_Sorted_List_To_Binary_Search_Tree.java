
public class Convert_Sorted_List_To_Binary_Search_Tree {
    TreeNode help(ListNode left, ListNode right){
        if(left==right) return null;
        ListNode first=left,next=left;
        while(next!=right&&next.next!=right){
            first=first.next;
            next=next.next.next;
        }
        TreeNode root=new TreeNode(first.val);
        if(first!=left) root.left=help(left,first);
        root.right=help(first.next,right);
        return root;
    }
    
    public TreeNode sortedListToBST(ListNode head) {
        return help(head,null);
    }
}
