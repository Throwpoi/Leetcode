import java.util.*;

public class Palindrome_Partitioning {
    boolean isPalindrome(String k){
        int length=k.length();
        int i=0,j=length-1;
        while(i<j){
            if(k.charAt(i)!=k.charAt(j)) return false;
            i++;j--;
        }
        return true;
    }
    
    void help(String s, List<String> temp, List<List<String>> result){
        if(s.length()==0){
            result.add(new ArrayList<String>(temp));
            return;
        }
        for(int i=0;i<s.length();i++){
            String newString=s.substring(0,i+1);
            if(isPalindrome(newString)){
                temp.add(newString);
                help(s.substring(i+1),temp,result);
                temp.remove(temp.size()-1);
            }
        }
    }
    
    public List<List<String>> partition(String s) {
        List<List<String>> result=new ArrayList<List<String>>();
        List<String> temp=new ArrayList<String>();
        help(s,temp,result);
        return result;
    }
}
