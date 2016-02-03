
public class Excel_Sheet_Column_Number {
    public int titleToNumber(String s) {
        int result=0,temp=1,length=s.length();
        for(int i=length-1;i>=0;i--){
            result+=temp*(s.charAt(i)-'A'+1);
            temp*=26;
        }
        return result;
    }
}
