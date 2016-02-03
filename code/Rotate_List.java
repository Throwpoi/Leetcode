
public class Rotate_List {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null) return head;
        ListNode temp=head;
        int t=0;
        while(temp!=null){temp=temp.next;t++;}
        if(k%t==0) return head;
        k%=t;
        ListNode next=head,first=head;
        while(k!=0){next=next.next;k--;}
        while(next.next!=null){next=next.next;first=first.next;}
        temp=first.next;first.next=null;
        next.next=head;head=temp;
        return head;        
    }
}
