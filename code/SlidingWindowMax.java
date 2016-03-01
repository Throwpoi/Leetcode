public class Solution {
    static class Node{
        int index;
        int val;
        public Node(int index, int val){
            this.index=index;
            this.val=val;
        }
    }
    
    public int[] maxSlidingWindow(int[] nums, int k) {
        int length=nums.length;
        if(length==0||length<k) return new int[0];
        int[] result=new int[length-k+1];
        Deque<Node> queue=new LinkedList<Node>();
        int i=0;
        while(i<k){
            while(!queue.isEmpty()&&queue.peekLast().val<=nums[i]) queue.removeLast();
            queue.addLast(new Node(i,nums[i++]));
        }
        for(int j=0;j<length-k+1;j++){
            result[j]=queue.peekFirst().val;
            if(j==length-k) break;
            if(queue.peekFirst().index==i-k) queue.removeFirst();
            while(!queue.isEmpty()&&queue.peekLast().val<=nums[i]) queue.removeLast();
            queue.addLast(new Node(i,nums[i++]));
        }
        return result;
    }
}
