
public class Remove_Linked_List_Elements {
    public ListNode removeElements(ListNode head, int val) {
        ListNode start=new ListNode(0);
        start.next=head;
        ListNode temp=start;
        while(temp.next!=null){
            if(temp.next.val==val) temp.next=temp.next.next;
            else temp=temp.next;
        }
        return start.next;
    }
}
