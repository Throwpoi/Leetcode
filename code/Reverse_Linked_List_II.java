
public class Reverse_Linked_List_II {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode newNode=new ListNode(0);newNode.next=head;
        ListNode temp=newNode;
        while(m!=1){temp=temp.next;m--;n--;}
        ListNode next=null,lastNode=temp,firstNode=temp.next,last=null;temp=temp.next;n--;
        while(n>=0){
            next=temp.next;temp.next=last;
            last=temp;temp=next;n--;
        }
        lastNode.next=last;firstNode.next=temp;
        return newNode.next;
    }
}
