
public class Linked_List_Cycle {
    public boolean hasCycle(ListNode head) {
        if(head==null) return false;
        ListNode first=head, next=head;
        while(next.next!=null&&next.next.next!=null){
            if(next.next==first||next.next.next==first) return true;
            next=next.next.next;first=first.next;
        }
        return false;
    }
}
