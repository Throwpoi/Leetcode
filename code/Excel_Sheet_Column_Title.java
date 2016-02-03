
public class Excel_Sheet_Column_Title {
    public String convertToTitle(int n) {
        StringBuilder result=new StringBuilder();
        do{
            n--;
            result.append((char)('A'+n%26));
            n/=26;
        }while(n!=0);
        return result.reverse().toString();
    }
}
