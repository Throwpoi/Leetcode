
public class Add_Binary {
    public String addBinary(String a, String b) {
        int i=a.length()-1,j=b.length()-1;
        int temp=0;
        String result="";
        while(i>=0&&j>=0){
            int k=temp+(a.charAt(i--)-'0')+(b.charAt(j--)-'0');
            result=k%2+result;temp=k/2;
        }
        if(i<0){
            while(j>=0){
                int k=temp+(b.charAt(j--)-'0');
                result=k%2+result;temp=k/2;
            }
        }
        else{
            while(i>=0){
                int k=temp+(a.charAt(i--)-'0');
                result=k%2+result;temp=k/2;
            }            
        }
        if(temp==1) result="1"+result;
        return result; 
    }
}
