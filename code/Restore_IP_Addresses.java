import java.util.*;

public class Restore_IP_Addresses {
    void help(String s, int n, StringBuilder temp, List<String> result){
        int length=s.length();
        if(n*3<length) return;
        if(n==0){
            result.add(temp.substring(0,temp.length()-1).toString());
            return;
        }
        if(length>0){
            temp.append(s.substring(0,1)+".");
            help(s.substring(1),n-1,temp,result);
            temp.delete(temp.length()-2,temp.length());
            if(s.charAt(0)=='0') return;
        }
        if(length>1){
            temp.append(s.substring(0,2)+".");
            help(s.substring(2),n-1,temp,result);
            temp.delete(temp.length()-3,temp.length());
        }
        if(length>2){
            if(s.charAt(0)<='1'||(s.charAt(0)=='2'&&((s.charAt(1)<='4')||(s.charAt(1)=='5'&&s.charAt(2)<='5')))){
                temp.append(s.substring(0,3)+".");
                help(s.substring(3),n-1,temp,result);
                temp.delete(temp.length()-4,temp.length());
            }
        }
    }
    
    public List<String> restoreIpAddresses(String s) {
        List<String> result=new ArrayList<String>();
        StringBuilder temp=new StringBuilder();
        help(s,4,temp,result);
        return result;
    }
}
