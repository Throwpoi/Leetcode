
public class Reorder_List {
    public void reorderList(ListNode head) {
        if(head==null) return;
        ListNode first=head, next=head;
        while(next.next!=null&&next.next.next!=null){
            first=first.next;
            next=next.next.next;
        }
        ListNode temp=first.next;first.next=null;
        ListNode last=null;
        while(temp!=null){
            next=temp.next;temp.next=last;
            last=temp;temp=next;
        }
        ListNode temp1=head,temp2=last;
        while(temp2!=null){
            temp=temp1.next;temp1.next=temp2;
            next=temp2.next;temp2.next=temp;
            temp1=temp;temp2=next;
        }
    }
}
