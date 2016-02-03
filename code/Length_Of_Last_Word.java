
public class Length_Of_Last_Word {
    public int lengthOfLastWord(String s) {
        int result=0,i=s.length()-1;
        while(i>=0&&s.charAt(i)==' ') i--;
        while(i>=0){
            if(s.charAt(i)==' ') break;
            else result++;
            i--;
        }
        return result;
    }
}
