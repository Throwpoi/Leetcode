
public class Remove_Duplicates_From_Sorted_List_II {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode newNode=new ListNode(0);
        ListNode last=newNode, temp=head;
        newNode.next=head;
        while(temp!=null&&temp.next!=null){
            if(temp.val==temp.next.val){
                while(temp.next!=null&&temp.val==temp.next.val) temp=temp.next;
                last.next=temp.next; temp.next=null;temp=last.next;
            }
            else{last=temp;temp=temp.next;}
        }
        return newNode.next;
    }
}
