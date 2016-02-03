
public class Intersection_Of_Two_Linked_Lists {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp1=headA,temp2=headB;
        while(temp1!=null&&temp2!=null){temp1=temp1.next;temp2=temp2.next;}
        while(temp1!=null){headA=headA.next;temp1=temp1.next;}
        while(temp2!=null){headB=headB.next;temp2=temp2.next;}
        while(headA!=headB){headA=headA.next;headB=headB.next;}
        return headA;
    }
}
