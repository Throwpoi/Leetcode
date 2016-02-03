
public class ZigZag_Conversion {
    public String convert(String s, int numRows) {
    	StringBuilder result=new StringBuilder();
        if(numRows==1) return s;
        int i=0,length=s.length(),step=2*(numRows-1);
        while(i<length){result.append(s.charAt(i));i+=step;}
        for(i=1;i<numRows-1;i++){
        	int j=i;
        	while(j<length){
        		result.append(s.charAt(j));
        		if(j+step-2*i<length) result.append(s.charAt(j+step-2*i));
        		else break;
        		j+=step;
        	}
        }
        while(i<length){result.append(s.charAt(i));i+=step;}
        return result.toString();
    }
}
