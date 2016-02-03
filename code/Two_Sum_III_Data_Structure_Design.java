import java.util.*;

public class Two_Sum_III_Data_Structure_Design {
    Map<Integer,Integer> a=new HashMap<Integer,Integer>();
    // Add the number to an internal data structure.
	public void add(int number) {
	    if(!a.containsKey(number)){
	        a.put(number,1);
	    }
	    else a.put(number,a.get(number)+1);
	    
	}

    // Find if there exists any pair of numbers which sum is equal to the value.
	public boolean find(int value) {
	    for(int i:a.keySet()){
	        if(i*2==value&&a.get(i)>1) return true;
	        else if(i*2!=value&&a.containsKey(value-i)) return true;
	    }
	    return false;
	}
}
