import java.util.*;

public class Fraction_To_Recurring_Decimal {
    public String fractionToDecimal(int numerator, int denominator) {
        if(numerator==0) return "0";
        if(denominator==0) return null;
        StringBuilder result=new StringBuilder();
        if((numerator<0&&denominator>0)||(numerator>0&&denominator<0)) result.append("-");
        long a=Math.abs((long)numerator), b=Math.abs((long)denominator);
        long res=a/b,remainer=(a%b)*10;result.append(String.valueOf(res));
        if(remainer==0) return result.toString();
        result.append(".");
        Map<Long,Integer> temp=new HashMap<Long,Integer>();
        while(remainer!=0){
        	if(temp.containsKey(remainer)){
        		result.insert(temp.get(remainer), "(");
        		return result.toString()+")";
        	}
        	temp.put(remainer,result.length());
        	result.append(String.valueOf(remainer/b));
        	remainer=(remainer%b)*10;
        }
        return result.toString();
    }
    
    public static void main(String[] args){
    	System.out.print("");
    }
}
