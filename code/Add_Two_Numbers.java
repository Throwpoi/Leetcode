import java.util.*;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
 

public class Add_Two_Numbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    	ListNode a=new ListNode(0);
    	ListNode head=a;
    	int temp=0,add=0;
        while(temp!=0||(l1!=null&&l2!=null)){
        	add=temp+(l1==null?0:l1.val)+(l2==null?0:l2.val);
        	ListNode next=new ListNode(add%10);
        	a.next=next;a=next;
        	temp=add/10;
        	l1=(l1==null)?l1:l1.next;
        	l2=(l2==null)?l2:l2.next;
        }
        a.next=(l1==null)?l2:l1;   //keep in mind, temp=0 and one of l1 and l2 is null,
                                   //then the iteration can finish!
        return head.next;
    }
}
