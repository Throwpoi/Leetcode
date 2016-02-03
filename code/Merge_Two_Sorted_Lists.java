
public class Merge_Two_Sorted_Lists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode temp=new ListNode(0),head=temp;
        while(l1!=null&&l2!=null){
        	if(l1.val<l2.val){
        		ListNode next=new ListNode(l1.val);
        		temp.next=next;temp=next;l1=l1.next;
        	}
        	else{
        		ListNode next=new ListNode(l2.val);
        		temp.next=next;temp=next;l2=l2.next;        		
        	}
        }
        temp.next=l1==null?l2:l1;
        head=head.next;
        return head;
    }
}
