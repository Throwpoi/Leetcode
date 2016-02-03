import java.util.*;
public class Number_Of_Islands_II {
    int count=0;
    int find(int[] nums, int num){
        if(nums[num]==num) return num;
        else return find(nums,nums[num]);
    }
    
    public List<Integer> numIslands2(int m, int n, int[][] positions) {
        int[] nums=new int[m*n];
        Arrays.fill(nums,-1);
        int[] a={-1,1,0,0,};
        int[] b={0,0,-1,1};
        List<Integer> result=new ArrayList<Integer>();
        for(int[] temp:positions){
            int newK=temp[0]*n+temp[1];
            nums[newK]=newK;count++;
            for(int i=0;i<4;i++){
                int x=temp[0]+a[i],y=temp[1]+b[i];
                int k=x*n+y;
                if(x<0||y<0||x>=m||y>=n||nums[k]==-1) continue;
                k=find(nums,k);
                nums[k]=newK;
                if(k!=newK) count--;
            }
            result.add(count);
        }
        return result;
    }
    
    public ListNode partition(ListNode head,int val){
        ListNode left=new ListNode(0);
        ListNode right=new ListNode(0);
        ListNode temp=head,temp1=left,temp2=right;
        while(temp!=null){
             int k=temp.val;
             if(k<val){temp1.next=temp;temp1=temp;} 
             else{temp2.next=temp;temp2=temp;}
             ListNode next=temp.next;
             temp.next=null;temp=next; 
        }
        temp1.next=right.next;
        return left.next;
   }
    
    public String count(String s){
        StringBuilder result=new StringBuilder();
        int length=s.length(),i=0;
        while(i<length){
             char start=s.charAt(i);
             int num=0;
             while(i<length&&s.charAt(i)==start){ i++;num++;}
             result.append(""+start+num);     
        }
        if(result.length()==length) return s;
        else return result.toString();
   }
    
    public static void main(String[] args){
    	int a=~0;
    	System.out.print(a);
    }
}
