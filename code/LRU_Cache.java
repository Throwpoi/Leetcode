import java.util.*;

class Node1{
    int key;
    int value;
    Node1 next=null;
    Node1 pre=null;
    public Node1(int key, int value){this.key=key;this.value=value;}
}

public class LRU_Cache {
    Node1 firstNode,lastNode;
    Map<Integer,Node1> a=new HashMap<Integer,Node1>();
    int capacity=0;
    int num=0;
    public LRU_Cache(int capacity) {
        firstNode=null;lastNode=null;this.capacity=capacity;
    }
    
    public int get(int key) {
        if(a.containsKey(key)){
            Node1 temp=a.get(key);
            if(temp!=lastNode){
                if(temp==firstNode){
                    firstNode=temp.next;temp.next=null;
                    firstNode.pre=null;lastNode.next=temp;
                    temp.pre=lastNode;lastNode=temp;
                }
                else{
                    temp.next.pre=temp.pre;temp.pre.next=temp.next;
                    temp.next=null;temp.pre=lastNode;
                    lastNode.next=temp;lastNode=temp;
                }
            }
            return temp.value;
        }
        else return -1;
    }
    
    public void set(int key, int value) {
        if(a.containsKey(key)){
            Node1 temp=a.get(key);
            if(temp!=lastNode){
                if(temp==firstNode){
                    firstNode=temp.next;temp.next=null;
                    firstNode.pre=null;lastNode.next=temp;
                    temp.pre=lastNode;lastNode=temp;
                }
                else{
                    temp.next.pre=temp.pre;temp.pre.next=temp.next;
                    temp.next=null;temp.pre=lastNode;
                    lastNode.next=temp;lastNode=temp;
                }
            }
            temp.value=value;
        }
        else{
            Node1 temp=new Node1(key,value);
            a.put(key,temp);
            if(num==capacity){
                a.remove(firstNode.key);
                if(num==1){firstNode=null;lastNode=null;}
                else{
                    Node1 newFirstNode=firstNode.next;
                    newFirstNode.pre=null;firstNode.next=null;
                    firstNode=newFirstNode;
                }
                num--;
            }
            if(num==0) firstNode=temp;
            else{lastNode.next=temp;temp.pre=lastNode;}
            lastNode=temp;num++;
        }
    }
}
