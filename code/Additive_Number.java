
public class Additive_Number {
    boolean help(String a, String b, String num){
        int length=num.length();
        if(length==0) return true;
        if(num.charAt(0)=='0'){
            if(!a.equals("0")||!b.equals("0")) return false;
        }
        long add=Long.parseLong(a)+Long.parseLong(b);
        String addition=String.valueOf(add);
        int length2=addition.length();
        if(addition.length()>length||!num.substring(0,length2).equals(addition)) return false;
        return help(b,addition,num.substring(length2));
    }
    
    public boolean isAdditiveNumber(String num) {
        int length=num.length();
        int half=length/2;
        if(num.charAt(0)=='0') half=1;
        for(int i=0;i<half;i++){
            String a=num.substring(0,i+1);
            if(i+1<length&&num.charAt(i+1)=='0'){
               if(i+2<length&&help(a,"0",num.substring(i+2))) return true;
               else continue;
            }
            for(int j=i+1;j<length;j++){
                String b=num.substring(i+1,j+1);
                if(j+1<length&&help(a,b,num.substring(j+1))) return true;
            }
        }
        return false;
    }
}
