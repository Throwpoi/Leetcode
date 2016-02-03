class Node5{
    int num;
    int index;
    Node5 pre=null;
    Node5 next=null;
    public Node5(int num, int index){this.num=num;this.index=index;}
}

class newQueue{
    Node5 root=null,last=null;
    public void offer(Node5 a){
        while(last!=null&&last.num<=a.num){
            Node5 temp=last.pre;
            last.pre=null;
            if(temp!=null) temp.next=null;
            last=temp;
        }
        if(last==null){
            root=a;last=a;
        }
        else{
            last.next=a;
            a.pre=last;
            last=a;
        }
    }
    
    public void poll(){
        Node5 temp=root.next;
        root.next=null;
        if(temp!=null) temp.pre=null;
        root=temp;
        if(root==null) last=null;
    } 
    
    public Node5 peek(){
        return root;
    }
}

public class Sliding_Window_Maximum {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int length=nums.length,t=length-k+1;
        int[] result=new int[t];
        if(length==0) return new int[0];
        int i=0,j=0;
        newQueue a=new newQueue();
        while(i<k){
            Node5 temp=new Node5(nums[i],i);
            a.offer(temp);i++;
        }
        while(i<length){
            Node5 temp=a.peek();
            result[j++]=temp.num;
            if((i-k)==temp.index) a.poll();
            a.offer(new Node5(nums[i],i));
            i++;
        }
        result[j]=a.peek().num;
        return result;
    }
}
