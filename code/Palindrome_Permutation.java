import java.util.*;

public class Palindrome_Permutation {
    public boolean canPermutePalindrome(String s) {
        int[] a=new int[128];
        for(char i:s.toCharArray()) a[i]^=1;
        for(int i=126;i>=0;i--) a[i]+=a[i+1];
        return a[0]<=1;
    }
    
    public boolean canPermutePalindrome1(String s) {
        BitSet a=new BitSet(128);
        for(char i:s.toCharArray()) a.flip(i);
        return a.cardinality()<2;
    }
    
    public static void main(String[] args){
    	String s="abcde";
    	byte[] k=s.getBytes();
    	System.out.println(k[0]);
    	System.out.println(k[1]);
    }
}
