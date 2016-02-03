import java.util.*;

public class Flip_Game {
    public List<String> generatePossibleNextMoves(String s) {
        List<String> result=new ArrayList<String>();
        int length=s.length();
        for(int i=0;i<length-1;i++){
            if(s.charAt(i)=='+'&&s.charAt(i+1)=='+'){
                result.add(s.substring(0,i)+"--"+s.substring(i+2));
            }
        }
        return result;
    }
}
