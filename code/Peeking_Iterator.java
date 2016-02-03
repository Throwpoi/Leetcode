import java.util.*;

public class Peeking_Iterator {
    int num=0;
    Iterator<Integer> iterator;
	public Peeking_Iterator(Iterator<Integer> iterator) {
	    // initialize any member here.
	    this.iterator=iterator;
	    num=iterator.next();
	}

    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
        return num;
	}

	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	public Integer next() {
	    int temp=num;
	    if(!iterator.hasNext()) iterator=null;
	    else num=iterator.next();
	    return temp;
	}

	public boolean hasNext() {
	    return !(iterator==null);
	}
}
