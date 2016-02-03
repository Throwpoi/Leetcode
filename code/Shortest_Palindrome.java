
public class Shortest_Palindrome {
    String help(String s, int j, int i){
        while(j>=0){
            if(s.charAt(j--)!=s.charAt(i++)) return null;
        }
        StringBuilder temp=new StringBuilder(s.substring(i));temp.reverse();
        return temp.toString()+s;
    }
    
    public String shortestPalindrome(String s) {
        if(s.length()==0) return s;
        int mid=(s.length()-1)/2;
        String temp="";
        while(mid>=1){
            temp=help(s,mid,mid);
            if(temp!=null) return temp;
            temp=help(s,mid-1,mid);
            if(temp!=null) return temp;
            mid--;
        }
        StringBuilder k=new StringBuilder(s.substring(1));k.reverse();
        return k.toString()+s;
    }
}
