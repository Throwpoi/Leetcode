
public class Sort_List {
    void mergeSort(ListNode start, ListNode end){
        if(start.next==end) return;
        ListNode first=start,second=start;
        while(second!=end&&second.next!=end){
            first=first.next;second=second.next.next;
        }
        ListNode temp=first.next;first.next=null;
        ListNode start2=new ListNode(0);start2.next=temp;
        mergeSort(start,first);mergeSort(start2,end);
        ListNode last=start,temp1=start.next,temp2=start2.next;
        while(temp1!=null&&temp2!=null){
            if(temp1.val<=temp2.val){last.next=temp1;last=temp1;temp1=temp1.next;}
            else{last.next=temp2;last=temp2;temp2=temp2.next;}
        }
        while(temp1!=null){last.next=temp1;last=temp1;temp1=temp1.next;}
        while(temp2!=null){last.next=temp2;last=temp2;temp2=temp2.next;}
        start2.next=null;
    }
    
    public ListNode sortList(ListNode head) {
        if(head==null) return head;
        ListNode start=new ListNode(0);
        start.next=head;
        ListNode temp=head;
        while(temp.next!=null) temp=temp.next;
        mergeSort(start,temp);
        return start.next;
    }
}
