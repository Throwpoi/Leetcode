
public class One_Edit_Distance {
    public boolean isOneEditDistance(String s, String t) {
        if(s.equals(t)) return false;
        int length1=s.length(),length2=t.length();
        if(length1==length2){
            boolean flag=false;
            for(int i=0;i<length1;i++){
                if(s.charAt(i)!=t.charAt(i)){
                    if(flag) return false;
                    else flag=true;
                }
            }
            return true;
        }
        else if(length1==length2-1){
            int i=0,j=0;
            boolean flag=false;
            while(i<length1){
                if(s.charAt(i)==t.charAt(j)){i++;j++;}
                else{
                    if(flag) return false;
                    else{j++;flag=true;}
                }
            }
            return true;
        }
        else if(length2==length1-1){
            int i=0,j=0;
            boolean flag=false;
            while(j<length2){
                if(s.charAt(i)==t.charAt(j)){i++;j++;}
                else{
                    if(flag) return false;
                    else{i++;flag=true;}
                }
            }
            return true;
        }
        else return false;
    }
}
