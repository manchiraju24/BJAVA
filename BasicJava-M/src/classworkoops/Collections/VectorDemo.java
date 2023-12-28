package classworkoops.Collections;

import java.util.Collections;
import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) throws Exception {
		intVector();
		
	}

	public static void intVector() throws Exception {
		
		Vector<Integer> v1 = new Vector<Integer>();
		
		/* Adding elements to Vector */

		v1.add(8);
		v1.add(18);
		v1.add(28);
		v1.add(38);
		v1.add(48);
		v1.add(58);
		v1.add(68);
		v1.add(78);
		v1.add(88);
		v1.add(98);
		v1.add(108);
		v1.add(208);
		v1.add(308);
		v1.add(408);
		v1.add(508);
		v1.add(608);
		v1.add(708);
		v1.add(808);
		v1.add(908);
		v1.add(1008);
		v1.add(2008);
		System.out.println("-----------------------------------------");
		System.out.println("Printing All Elements");
		System.out.println(v1);
		System.out.println("Capacity : " + v1.capacity());
		System.out.println("Size : " + v1.size());
		System.out.println("-----------------------------------------");
		
		/* Checking elements exists are not */
		System.out.println("Array List contains : " + v1.contains(208));
		System.out.println("-----------------------------------------");
		
		/* Accessing Item using index */
		System.out.println("Get item at Index : " + v1.get(5));
		System.out.println("-----------------------------------------");
		
		/* Checking whether Empty or not */
		System.out.println("Is Empty : " + v1.isEmpty() );
		System.out.println("-----------------------------------------");
		
		/* Modifying/ Setting value by index */
		v1.set(6, 51);
		printUsingIterator(v1);
		System.out.println("-----------------------------------------");
		
		Collections.sort(v1);
		System.out.println("After Sorting ");
		System.out.println(v1);
		System.out.println("-----------------------------------------");
		
		/*Reversing List */
		Collections.reverse(v1);
		System.out.println("After reversing ");
		System.out.println(v1);
		System.out.println("-----------------------------------------");
		
		/* Shuffling List */
		Collections.shuffle(v1);
		System.out.println("After Shuffling ");
		System.out.println(v1);
		System.out.println("-----------------------------------------");
	}
	
	public static void printUsingIterator(Vector<Integer> vIn) throws Exception{
		Iterator<Integer> v2 =  vIn.iterator();
		while(v2.hasNext()){
			System.out.println(v2.next());
		}
		
	}
}
