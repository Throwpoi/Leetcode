
public class Plus_One {
    public static int[] plusOne(int[] digits) {
        int temp=1;
        int[] a=new int[digits.length];
        int[] b=new int[digits.length+1];
        for(int i=digits.length-1;i>=0;i--){
            int k=temp+digits[i];
            temp=k/10;
            a[i]=k%10;b[i+1]=k%10;
        }
        if(temp==1){
            b[0]=1;return b;
        }
        else return a;
    }
    
    public static void main(String[] args){
    	int[] digits={0};
    	int[] result=plusOne(digits);
    	for(int i:result)
    		System.out.print(i+" ");
    }
}
