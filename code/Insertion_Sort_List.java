
public class Insertion_Sort_List {
    public ListNode insertionSortList(ListNode head) {
        if(head==null) return head;
        ListNode startNode=new ListNode(0);
        startNode.next=head;
        ListNode newHead=head;
        while(newHead.next!=null){
            ListNode temp=head, lastNode=startNode;
            while(temp!=newHead.next&&temp.val<=newHead.next.val){
                temp=temp.next;lastNode=lastNode.next;
            }
            if(temp!=newHead.next){
                lastNode.next=newHead.next;
                newHead.next=newHead.next.next;
                lastNode.next.next=temp;
                head=startNode.next;
            }
            else newHead=newHead.next;
        }
        return startNode.next;
    }
}
