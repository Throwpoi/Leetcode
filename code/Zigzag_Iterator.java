import java.util.*;

public class Zigzag_Iterator {
	public static void main(String[] args){
		List<Iterator<Integer>> a=new ArrayList<Iterator<Integer>>();
		List<Integer> temp1=new ArrayList<Integer>();
		List<Integer> temp2=new ArrayList<Integer>();
		temp1.add(1);temp2.add(2);
		a.add(temp1.iterator());a.add(temp2.iterator());
		Iterator<Iterator<Integer>> b=a.iterator();
		Iterator<Iterator<Integer>> c=a.iterator();
		Iterator<Integer> d=b.next();
		System.out.println(b==c);
	}
}
