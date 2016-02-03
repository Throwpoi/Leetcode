
public class Delete_Node_In_A_Linked_List {
    public void deleteNode(ListNode node) {
        ListNode last=null;
        while(node.next!=null){node.val=node.next.val;last=node;node=node.next;}
        last.next=null;
    }
}
