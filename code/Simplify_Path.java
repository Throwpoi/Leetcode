import java.util.Stack;

public class Simplify_Path {
    public String simplifyPath(String path) {
        path=path+'/';
        Stack<Character> a=new Stack<Character>();
        String result="";
        int i=0;
        while(i<path.length()){
            char temp=path.charAt(i);
            if(temp=='/'){
                if(!a.isEmpty()&&a.peek()=='.'){
                    a.pop();
                    if(a.peek()=='.'){
                        a.pop();
                        if(a.peek()=='/'){
                            a.pop();
                            while(!a.isEmpty()&&a.peek()!='/') a.pop();
                        }
                        else{a.push('.');a.push('.');a.push('/');}
                    } 
                }
                else if(a.isEmpty()||a.peek()!='/') a.push(temp);
            }
            else a.push(temp);
            if(a.isEmpty()) a.push('/');
            i++;
        }
        if(a.peek()=='/') a.pop();
        if(a.isEmpty()) return "/";
        while(!a.isEmpty()) result=a.pop()+result;
        return result;        
    }
    
    public String simplifyPath1(String path) {
        String[] a=path.split("/");
        StringBuilder result=new StringBuilder();
        for(int i=0;i<a.length;i++){
            String temp=a[i];
            if(temp.equals("")||temp.equals(".")) continue;
            else if(temp.equals("..")){
                int j=result.length()-1;
                while(j>=0&&result.charAt(j)!='/') j--;
                if(j>=0) result.delete(j,result.length());
            }
            else result.append("/"+temp);
        }
        if(result.length()==0) return "/";
        else return result.toString();
    }
    
    public static void main(String[] args){
    	String path="aaa..f ...dsfadsas. wwww";
    	String[] k=path.split("\\.");
    	System.out.println(k[0]);
    	System.out.println(k[1]);
    	System.out.println(k[2]);
    }
}
