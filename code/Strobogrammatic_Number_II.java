import java.util.*;

public class Strobogrammatic_Number_II {
    char reverse(char a){
        if(a=='1') return '1';
        if(a=='8') return '8';
        if(a=='0') return '0';
        if(a=='6') return '9';
        if(a=='9') return '6';
        return ' ';
    }
    
    void help(int i, int n, char[] a, StringBuilder temp, List<String> result){
        if(i>n){
            result.add(temp.toString());
            return;
        }
        if(i<=n/2){
            for(int j=0;j<5;j++){
                if(j==0&&i==1) continue;
                temp.append(a[j]);
                help(i+1,n,a,temp,result);
                temp.deleteCharAt(temp.length()-1);
            }
        }
        else if(n%2!=0&&i==n/2+1){
            for(int j=0;j<5;j++){
                if(j==2||j==4) continue;
                temp.append(a[j]);
                help(i+1,n,a,temp,result);
                temp.deleteCharAt(temp.length()-1);
            }
        }
        else{
            temp.append(reverse(temp.charAt(n-i)));
            help(i+1,n,a,temp,result);
            temp.deleteCharAt(temp.length()-1);
        }
    }
    
    public List<String> findStrobogrammatic(int n) {
        List<String> result=new ArrayList<String>();
        StringBuilder temp=new StringBuilder();
        char[] a={'0','1','6','8','9'};
        help(1,n,a,temp,result);
        return result;
    }
}
