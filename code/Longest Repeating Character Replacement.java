public class Solution {
    public int characterReplacement(String s, int k) {
        int[] count=new int[26];
        int maxCount=0,result=0;
        int start=0,end=0,length=s.length();
        while(end<length){
            maxCount=Math.max(maxCount,++count[s.charAt(end++)-'A']);
            while(end-start-maxCount>k){
                count[s.charAt(start++)-'A']--;
            }
            result=Math.max(result,end-start);
        }
        return result;
    }
}
