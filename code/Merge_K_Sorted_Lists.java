class heap{
	ListNode[] store;
	int size=0;
	
	public heap(int i){
		store=new ListNode[i+1];
	}
	
	private void swap(int i, int j){
		ListNode temp=store[i];
		store[i]=store[j];
		store[j]=temp;	
	}
	
	public void add(ListNode a){
		store[++size]=a;
		int i=size;
		while(i!=1&&store[i/2].val>store[i].val){
			swap(i,i/2);
			i/=2;
		}
	}
	
	public ListNode deQueue(){
		ListNode result=store[1];
		store[1]=store[size--];
		int i=1;
		while(i*2+1<=size&&store[i].val>Math.min(store[2*i].val, store[2*i+1].val)){
			if(store[i].val>store[2*i].val){
				if(store[2*i].val<store[2*i+1].val){swap(i,2*i);i*=2;}
				else{swap(i,2*i+1);i*=2;i++;}
			}
			else{swap(i,2*i+1);i*=2;i++;}
		}
		if(i*2<=size&&store[i].val>store[2*i].val) swap(i,2*i);
		return result;
	}
	
	public boolean isEmpty(){return size==0;}
}

public class Merge_K_Sorted_Lists {
    public ListNode mergeKLists(ListNode[] lists) {
    	ListNode head=new ListNode(0),res=head;
        heap a=new heap(lists.length);
        for(int i=0;i<lists.length;i++)
        	if(lists[i]!=null)
            	a.add(lists[i]);
        while(!a.isEmpty()){
        	ListNode temp=a.deQueue();
        	res.next=temp;res=temp;
        	if(temp.next!=null){a.add(temp.next);temp.next=null;}
        }
        return head.next;
    }
}
