public class BasicCalculator {
    private boolean isNumber(char in){
        return in>='0'&&in<='9';
    }
    
    //No need for stack, optimized speed
    public int calculate(String s) {
        if(s==null) return 0;
        int length=s.length();
        int i=0,first=0,second=0,size=0;
        char addAndSub=' ', mulAndDiv=' ';
        while(i<length){
            char temp=s.charAt(i);
            if(temp==' '){i++;continue;}
            else if(temp=='*'||temp=='/'){mulAndDiv=temp;i++;}
            else if(temp=='+'||temp=='-'){
                if(size>1){
                    if(addAndSub=='+') first+=second;
                    else first-=second;
                    size=1;
                }
                addAndSub=temp;i++;
            }
            else{
                int num=0;
                while(i<length&&isNumber(s.charAt(i))){
                    num*=10;num+=(s.charAt(i)-'0');
                    i++;
                }
                if(mulAndDiv!=' '){
                    if(mulAndDiv=='*'&&size==1) first*=num;
                    else if(mulAndDiv=='/'&&size==1) first/=num;
                    else if(mulAndDiv=='*'&&size==2) second*=num;
                    else second/=num;
                    mulAndDiv=' ';
                }
                else{
                    if(size==1) second=num;
                    else first=num;
                    size++;
                }
            }
        }
        if(size==2){
            if(addAndSub=='+') return first+second;
            else return first-second;
        }
        else if(size==0) return 0;
        else return first;
    }
}
