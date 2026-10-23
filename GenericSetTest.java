import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

//Jackie Ganem
//This file has methods that test that the file GenericSet
// correctly adds a value to a given set, 
//gets the size of the given set, sees if an element
//is in the set, and gets the union and intersection of 
//two generic sets

class GenericSetTest {


	@Test
	void testAddAndSize() {
		 GenericSet<Integer> set = new GenericSet<Integer>();
		 assertTrue(set.add(87));
		 assertEquals(1, set.size());
		 assertTrue(set.contains(87));
	}
	@Test
	void testUnion() {
		 GenericSet<Integer> set = new GenericSet<Integer>();
		 GenericSet<Integer> set2 = new GenericSet<Integer>();
		 assertTrue(set.add(87));
		 assertTrue(set2.add(7));
		 GenericSet<Integer> set3 = set.union(set2);
		 assertTrue(set3.contains(7));
	}
	@Test
	void testIntersection() {
		 GenericSet<Integer> set = new GenericSet<Integer>();
		 GenericSet<Integer> set2 = new GenericSet<Integer>();
		 assertTrue(set.add(2));
		 assertTrue(set2.add(2));
		 assertTrue(set.add(1));
		 assertTrue(set2.add(3));
		 GenericSet<Integer> set3 = set.intersection(set2);
		 assertTrue(set3.contains(2));
		 assertFalse(set3.contains(1));
		 
	}



}
