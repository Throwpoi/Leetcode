
public class Reverse_Words_In_A_String_II {
    void swap(char[] s, int i, int j){
        char temp=s[i];
        s[i]=s[j];s[j]=temp;
    }
    
    void reverse(char[] s, int i, int j){
        while(i<j){swap(s,i++,j--);}
    }
    
    public void reverseWords(char[] s) {
        int start=0,length=s.length;
        if(length==0) return;
        for(int i=0;i<=length;i++){
            if(i==length||s[i]==' '){
                reverse(s,start,i-1);start=i+1;
            }
        }
        reverse(s,0,length-1);
    }
}
