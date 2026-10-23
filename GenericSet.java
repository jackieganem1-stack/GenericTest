import java.util.HashSet;
import java.util.Set;
import java.util.function.BooleanSupplier;

// Jackie Ganem
// This file has methods that add a value to a set, 
// gets the size of the given set, sees if an element
// is in the set, and gets the union and intersection of 
// two generic sets

public class GenericSet<T> {
	
	Set< T > set = new HashSet< T >();
	
	public boolean add(T i) {
		return set.add(i);
	}
	public int size() {
		return set.size();
	}
	public boolean contains(T t) {
		return set.contains(t);
	}
	
	public GenericSet<T> union(GenericSet<T> j) {
		GenericSet<T> newSet = new GenericSet<T>();
		for (T t : j.set) {
			newSet.add(t);
		}
		return newSet;
	}
	
	public GenericSet<T> intersection(GenericSet<T> j) {
		GenericSet<T> newSet = new GenericSet<T>();
		for (T t : j.set) {
			if(set.contains(t)) {
				newSet.add(t);
			}
		}
		return newSet;
	}


}
