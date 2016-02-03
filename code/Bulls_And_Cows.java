
public class Bulls_And_Cows {
    public String getHint(String secret, String guess) {
        int[] a=new int[10],b=new int[10];
        int num1=0,num2=0,length=secret.length();
        for(int i=0;i<length;i++){
            int temp1=secret.charAt(i)-'0';
            int temp2=guess.charAt(i)-'0';
            if(temp1==temp2) num1++;
            else{
                a[temp1]++;
                b[temp2]++;
            }
        }
        for(int i=0;i<10;i++) num2+=Math.min(a[i],b[i]);
        return num1+"A"+num2+"B";
    }
    
    public static void main(String[] args){
    	System.out.println("");
    }
}
