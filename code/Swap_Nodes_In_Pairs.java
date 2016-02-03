
public class Swap_Nodes_In_Pairs {
    public ListNode swapPairs(ListNode head) {
    	if(head==null) return head;
    	ListNode last=new ListNode(0), temp=head;
    	last.next=head;head=last;
    	while(temp!=null&&temp.next!=null){
    		last.next=temp.next;
    		ListNode temp1=temp.next.next;
    		temp.next.next=temp;
    		temp.next=temp1;
    		last=temp;temp=temp1;
    	}
    	return head.next;
    }	
}
