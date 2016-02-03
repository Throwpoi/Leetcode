import java.util.*;

class RandomListNode {
    int label;
    RandomListNode next, random;
    RandomListNode(int x) { this.label = x; }
};

public class Copy_List_With_Random_Pointer {
    public RandomListNode copyRandomList(RandomListNode head) {
        RandomListNode temp=head,last=null,newHead=null;
        Map<RandomListNode,RandomListNode> a=new HashMap<RandomListNode,RandomListNode>();
        Map<RandomListNode,RandomListNode> b=new HashMap<RandomListNode,RandomListNode>();
        while(temp!=null){
            RandomListNode newNode=new RandomListNode(temp.label);
            if(temp==head) newHead=newNode;
            else last.next=newNode;
            a.put(temp,newNode);b.put(newNode,temp);last=newNode;temp=temp.next;
        }
        temp=newHead;
        while(temp!=null){
            RandomListNode k=b.get(temp).random;
            if(k!=null) temp.random=a.get(k);
            temp=temp.next;
        }
        return newHead;
    }
    
    public RandomListNode copyRandomList1(RandomListNode head) {
        RandomListNode temp=head,last=null,newHead=null;
        Map<RandomListNode,RandomListNode> a=new HashMap<RandomListNode,RandomListNode>();
        while(temp!=null){
            RandomListNode newNode;
            if(a.containsKey(temp)) newNode=a.get(temp);
            else{newNode=new RandomListNode(temp.label);a.put(temp,newNode);}
            if(temp==head) newHead=newNode;
            else last.next=newNode;
            RandomListNode random=temp.random;
            if(random!=null){
                if(a.containsKey(random)) newNode.random=a.get(random);
                else{newNode.random=new RandomListNode(random.label);a.put(random,newNode.random);}
            }
            last=newNode;temp=temp.next;
        }
        return newHead;
    }
}
