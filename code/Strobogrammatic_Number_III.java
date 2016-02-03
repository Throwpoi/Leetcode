
public class Strobogrammatic_Number_III {
    static String createMax(int n){
        StringBuilder result=new StringBuilder();
        while(n>0){result.append('9');n--;}
        return result.toString();
    }
    
    static String createMin(int n){
        StringBuilder result=new StringBuilder();
        result.append('1');
        while(n>1){result.append('0');n--;}
        return result.toString();
    }
    
    static int help(int length, int i, char[] a, String low, String high){
        if(i>(length-1)/2) return 1;
        else{
            int num=0;
            for(int j=0;j<5;j++){
                if(length%2!=0&&i==length/2&&(j==2||j==4)) continue;
                char temp=a[j];
                if((low==null||temp>=low.charAt(i))&&(high==null||temp<=high.charAt(i))){
                    if(low!=null&&temp==low.charAt(i)) num+=help(length,i+1,a,low,null);
                    else if(high!=null&&temp==high.charAt(i)) num+=help(length,i+1,a,null,high);
                    else num+=help(length,i+1,a,null,null);
                }
            }
            return num;
        }
    }
    
    public static int strobogrammaticInRange(String low, String high) {
        char[] a={'0','1','6','8','9'};
        int length1=low.length(),length2=high.length();
        if(length1>length2) return 0;
        if(length1==length2) return help(length1,0,a,low,high);
        else{
            int num=0;
            num+=help(length1,0,a,low,createMax(length1));
            System.out.println(num);
            num+=help(length2,0,a,createMin(length2),high);
            System.out.println(num);
            for(int i=length1+1;i<length2;i++){
                num+=help(i,0,a,createMin(i),createMax(i));
                System.out.println(num);
            }
            return num;
        }
    }
    
    public static void main(String[] args){
    	System.out.println(strobogrammaticInRange("0", "1680"));
    }
}
