
public class Palindrome_Linked_List {
    public boolean isPalindrome(ListNode head) {
        ListNode first=head,second=head;
        while(first!=null&&first.next!=null){first=first.next.next;second=second.next;}
        if(first!=null) second=second.next;
        ListNode last=null;
        while(second!=null){
            ListNode temp=second.next;
            second.next=last;last=second;second=temp;
        }
        first=head;second=last;
        while(second!=null){
            if(first.val!=second.val) return false;
            first=first.next;second=second.next;
        }
        return true;
    }
}
