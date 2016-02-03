
public class Longest_Common_Prefix {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder result=new StringBuilder();
        int i=0;
        if(strs.length==0) return result.toString();
        while(i<strs[0].length()){
        	char temp=strs[0].charAt(i);
        	for(int j=1;j<strs.length;j++){
        		if(i==strs[j].length()||strs[j].charAt(i)!=temp) return result.toString();
        	}
        	result.append(temp);
        	i++;
        }
        return result.toString();
    }
}
