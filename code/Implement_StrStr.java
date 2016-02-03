
public class Implement_StrStr {
    public int strStr(String haystack, String needle) {
        int length1=haystack.length(),length2=needle.length();
        if(length1<length2) return -1;
        for(int i=0;i<=length1-length2;i++)
        	if(haystack.substring(i,i+length2).equals(needle))
        		return i;
        return -1;
    }
}
