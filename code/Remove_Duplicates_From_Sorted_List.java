
public class Remove_Duplicates_From_Sorted_List {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp=head;
        while(temp!=null&&temp.next!=null){
            ListNode temp2=temp;
            while(temp2.next!=null&&temp2.val==temp2.next.val) temp2=temp2.next;
            if(temp!=temp2){temp.next=temp2.next;temp2.next=null;}
            temp=temp.next;
        }
        return head;
    }
}
