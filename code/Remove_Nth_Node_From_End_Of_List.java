
public class Remove_Nth_Node_From_End_Of_List {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode first=head,next=head,last=null;
    	while(n!=0){first=first.next;n--;}
    	if(first==null){head=head.next;return head;}
    	while(first!=null){last=next;next=next.next;first=first.next;}
    	last.next=next.next;
    	return head;
    }
}
