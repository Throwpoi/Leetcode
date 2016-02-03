import java.util.*;

public class Largest_Number {
    public String largestNumber(int[] nums) {
        String[] a=new String[nums.length];
        for(int i=0;i<nums.length;i++) a[i]=String.valueOf(nums[i]);
        Arrays.sort(a,new Comparator<String>(){
            public int compare(String a, String b){
                String temp1=a+b,temp2=b+a;
                for(int i=0;i<temp1.length();i++){
                    if(temp1.charAt(i)>temp2.charAt(i)) return 1;
                    if(temp2.charAt(i)>temp1.charAt(i)) return -1;
                }
                return 0;
            }
        });
        StringBuilder result=new StringBuilder();
        for(int i=nums.length-1;i>=0;i--) result.append(a[i]);
        while(result.length()>1&&result.charAt(0)=='0') result.deleteCharAt(0);
        return result.toString();
    }
}
