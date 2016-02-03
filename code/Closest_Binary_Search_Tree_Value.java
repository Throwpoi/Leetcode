import java.util.*;
public class Closest_Binary_Search_Tree_Value {
    Double dis=null;
    int n=0;
    void help(TreeNode root, double target){
        if(root==null) return;
        if((double)root.val==target){n=(int)target;return;}
        else if(root.val>target){
            double newDis=root.val-target;
            if(dis==null||newDis<dis){dis=newDis;n=root.val;}
            help(root.left,target);
        }
        else{
            double newDis=target-root.val;
            if(dis==null||newDis<dis){dis=newDis;n=root.val;}
            help(root.right,target);            
        }
    }
    
    public int closestValue(TreeNode root, double target) {
        help(root,target);
        return n;
    }
    
    public static void main(String[] args){
    	PriorityQueue<Integer> temp=new PriorityQueue<Integer>(10,new Comparator<Integer>(){
    		public int compare(Integer a, Integer b){
    			return b-a;
    		}
    	});
    	int[] array={7,3,6,1,9,10,2,4};
    	for(int i:array) temp.offer(i);
    	while(!temp.isEmpty()) System.out.println(temp.poll());
    }
}
