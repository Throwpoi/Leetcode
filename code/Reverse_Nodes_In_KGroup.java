
public class Reverse_Nodes_In_KGroup {
    public ListNode reverseKGroup(ListNode head, int k) {
    	if(k==1) return head;
    	boolean flag=true;
        ListNode last=new ListNode(0),temp=head,tail=head,next;
        last.next=head;head=last;
        while(temp!=null){
        	int i=k;
        	next=temp.next;
        	while(i>1&&next!=null){
        		ListNode next2=next.next;
        		next.next=temp;
        		if(i==k){temp.next=null;tail=temp;}
        		temp=next;next=next2;i--;
        	}
        	if(i!=1){flag=false;break;}
        	last.next=temp;tail.next=next;last=tail;temp=next;
        }
        if(!flag){
        	next=temp.next;
        	while(next!=null){
        		ListNode next2=next.next;
        		next.next=temp;
        		if(!flag){temp.next=null;flag=true;}
        		temp=next;next=next2;
        	}
        }
        return head.next;
    }
}
