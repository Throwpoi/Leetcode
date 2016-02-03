import java.util.*;

public class Letter_Combinations_Of_A_Phone_Number {
	static List<Character> numToChar(int a){
		switch(a){
		case 2: return Arrays.asList('a','b','c');
		case 3: return Arrays.asList('d','e','f');
		case 4: return Arrays.asList('g','h','i');
		case 5: return Arrays.asList('j','k','l');
		case 6: return Arrays.asList('m','n','o');
		case 7: return Arrays.asList('p','q','r','s');
		case 8: return Arrays.asList('t','u','v');
		case 9: return Arrays.asList('w','x','y','z');
		}
		return null;
	}
	
	static void help(String digits, List<String> result, StringBuilder temp){
		if(digits.length()==0){
			result.add(temp.toString());
			return;
		}
		List<Character> a=numToChar(digits.charAt(0)-'0');
		for(Character k:a){
			temp.append(k);
			help(digits.substring(1),result,temp);
			temp.deleteCharAt(temp.length()-1);
		}
	}
	
    public static List<String> letterCombinations(String digits) {
        List<String> result=new ArrayList<String>();
        if(digits.length()==0) return result;
    	StringBuilder temp=new StringBuilder();
    	help(digits,result,temp);
    	return result;
    }
    
    public static void main(String[] args){
    	System.out.println(letterCombinations("23"));
    }
}
