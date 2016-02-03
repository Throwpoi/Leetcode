
public class Maximum_Product_Of_Word_Lengths {
    public int maxProduct(String[] words) {
        int length=words.length;
        int[] num=new int[length];
        for(int i=0;i<length;i++){
            String temp=words[i];
            int result=0,length1=temp.length();
            for(int j=0;j<length1;j++){
                int k=1<<(temp.charAt(j)-'a');
                if((result&k)==0) result+=k;
            }
            num[i]=result;
        }
        int max=0;
        for(int i=0;i<length;i++){
            for(int j=i+1;j<length;j++){
                int num1=num[i],num2=num[j];
                if((num1&num2)==0) max=Math.max(max,words[i].length()*words[j].length());
            }
        }
        return max;
    }
    
    public static void main(String[] args){
    	
    }
}
