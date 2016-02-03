import java.util.*;

class Node6{
    int val;
    Node6 left;
    Node6 right;
    int num;
    public Node6(int val,int num){this.val=val;this.num=num;}
}

public class Count_Of_Smaller_Numbers_After_Self {
    void build(Node6 root, int target, int temp, List<Integer> result){
        if(target>root.val){
            if(root.right==null){
                temp+=root.num;root.num++;
                result.add(temp);
                root.right=new Node6(target,1);
            }
            else{
                temp+=root.num-root.right.num;
                root.num++;
                build(root.right,target,temp,result);
            }
        }
        else{
            if(root.left==null){
                root.num++;
                result.add(temp);
                root.left=new Node6(target,1);
            }
            else{
                root.num++;
                build(root.left,target,temp,result);
            }
        }
    }

    public List<Integer> countSmaller(int[] nums) {
        int length=nums.length;
        List<Integer> result=new ArrayList<Integer>();
        if(length==0) return result;
        Node6 root=new Node6(nums[length-1],1);
        result.add(0);
        for(int i=length-2;i>=0;i--){
            int temp=0;
            build(root,nums[i],temp,result);
        }
        List<Integer> output=new ArrayList<Integer>();
        for(int i=length-1;i>=0;i--){
            output.add(result.get(i));
        }
        return output;
    }
    
    public static void main(String[] args){
    	
    }
}
