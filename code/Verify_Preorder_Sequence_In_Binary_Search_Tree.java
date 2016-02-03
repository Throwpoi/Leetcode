import java.util.*;

/*
Kinda simulate the traversal, keeping a stack of nodes (just their values) of which we're still in the left subtree. 
If the next number is smaller than the last stack value, then we're still in the left subtree of all stack nodes, 
so just push the new one onto the stack. But before that, pop all smaller ancestor values, 
as we must now be in their right subtrees (or even further, in the right subtree of an ancestor). 
Also, use the popped values as a lower bound, since being in their right subtree means we must never come across a smaller number anymore.
 */

public class Verify_Preorder_Sequence_In_Binary_Search_Tree {
    public boolean verifyPreorder(int[] preorder) {
        int length=preorder.length;
        int min=Integer.MIN_VALUE;
        Stack<Integer> a=new Stack<Integer>();
        for(int i:preorder){
            if(i<min) return false;
            while(!a.isEmpty()&&a.peek()<i) min=a.pop();
            a.push(i);
        }
        return true;
    }
    
    public boolean verifyPreorder1(int[] preorder) {
        int length=preorder.length;
        int min=Integer.MIN_VALUE;
        int index=-1;
        for(int i:preorder){
            if(i<min) return false;
            while(index>=0&&preorder[index]<i) min=preorder[index--];
            preorder[++index]=i;
        }
        return true;
    }
    
}
