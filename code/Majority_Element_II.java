import java.util.*;

public class Majority_Element_II {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> result=new ArrayList<Integer>();
        Integer a=null,b=null;
        int num1=0,num2=0,length=nums.length;
        if(length==0) return result;
        for(int i=0;i<length;i++){
            int temp=nums[i];
            if(num1==0){num1++;a=temp;}
            else if(num2==0&&temp!=a){num2++;b=temp;}
            else if(temp==a) num1++;
            else if(temp==b) num2++;
            else{num1--;num2--;}
        }
        int k=0;
        for(int i=0;i<length;i++){
            if(nums[i]==a) k++;
        }
        if(k>length/3) result.add(a);
        if(num2!=0&&b!=a){
            k=0;
            for(int i=0;i<length;i++){
                if(nums[i]==b) k++;
            }
            if(k>length/3) result.add(b);
        }
        return result;
    }
}
