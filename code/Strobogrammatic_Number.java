
public class Strobogrammatic_Number {
    boolean help(char a, char b){
        if(a=='1') return b=='1';
        if(a=='8') return b=='8';
        if(a=='0') return b=='0';
        if(a=='6') return b=='9';
        if(a=='9') return b=='6';
        return false;
    }
    
    public boolean isStrobogrammatic(String num) {
        int i=0,j=num.length()-1;
        if(j==-1) return true;
        while(i<j){
            if(!help(num.charAt(i++),num.charAt(j--))) return false;
        }
        if(i==j) return num.charAt(i)=='0'||num.charAt(i)=='8'||num.charAt(i)=='1';
        else return true; 
    }
}
