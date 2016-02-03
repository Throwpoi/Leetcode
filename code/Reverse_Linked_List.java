
public class Reverse_Linked_List {
    public ListNode reverseList(ListNode head) {
        if(head==null) return null;
        ListNode start=new ListNode(0);
        start.next=head;
        ListNode last=start,temp=head;
        while(temp!=null){
            ListNode next=temp.next;
            temp.next=last;last=temp;temp=next;
        }
        head.next=null;
        return last;
    }
}
