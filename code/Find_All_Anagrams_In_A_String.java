public class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int ls=s.length(), lp=p.length();
        List<Integer> result=new ArrayList<Integer>();
        if(ls<lp){
            return result;
        }
        int start=0, end=0, total=0;
        int[] check=new int[26];
        while(end<lp){
            check[p.charAt(end++)-'a']++;
        }
        end=0;
        while(end<ls){
            if(end-start==lp){
                total-=(check[s.charAt(start++)-'a']++>=0?1:0);
            }
            total+=(check[s.charAt(end++)-'a']-->0?1:0);
            if(total==lp){
                result.add(start);
            }
        }
        return result;
    }
}
