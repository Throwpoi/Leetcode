
public class Linked_List_Cycle_II {
    public ListNode detectCycle(ListNode head) {
        if(head==null) return null;
        ListNode first=head, next=head;
        boolean flag=false;
        while(next.next!=null&&next.next.next!=null){
            if(next.next==first||next.next.next==first){
                flag=true;break;
            }
            next=next.next.next;first=first.next;
        }
        if(!flag) return null;
        while(next!=first){
            next=next.next.next;first=first.next;
        }
        ListNode mid=head;
        while(mid!=first){
            mid=mid.next;first=first.next;
        }
        return mid;
    }
}
