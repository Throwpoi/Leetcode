
public class Partition_List {
    public ListNode partition(ListNode head, int x) {
        if(head==null) return null;
        ListNode head1=new ListNode(0);
        ListNode head2=new ListNode(0);
        head1.next=head;ListNode temp=head1, temp1=head2;
        while(temp.next!=null){
            if(temp.next.val>=x){
                ListNode newNode=temp.next;
                temp.next=temp.next.next;newNode.next=null;
                temp1.next=newNode;temp1=newNode;
            }
            else temp=temp.next;
        }
        temp.next=head2.next;head2.next=null;return head1.next;
    }
}
