
public class Reverse_Words_In_A_String {
    public String reverseWords(String s) {
        StringBuilder result=new StringBuilder();
        String[] k=s.split(" ");
        for(int i=k.length-1;i>=0;i--){
            String temp=k[i];
            if(temp.equals("")) continue;
            else{
                result.append(temp+" ");
            }
        }
        if(result.length()!=0) result.deleteCharAt(result.length()-1);
        return result.toString();
    }
}
