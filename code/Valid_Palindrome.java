
public class Valid_Palindrome {
    public boolean isPalindrome(String s) {
        char[] a=s.toCharArray();
        int i=0,j=a.length-1;
        while(i<j){
            while(i<j&&!Character.isLetterOrDigit(a[i])) i++;
            while(i<j&&!Character.isLetterOrDigit(a[j])) j--;
            if(i<j){
                if(Character.toLowerCase(a[i])!=Character.toLowerCase(a[j])) return false;
                else{i++;j--;}
            }
        }
        return true;    	
    }
}
