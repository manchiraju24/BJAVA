package classworkoops.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class ArrayListDemo {

	public static void main(String[] args) throws Exception {
	 	arrayList();
		arrayListAlgos();
	
	}

	public static void arrayList() throws Exception {
		
		List<String> a1 = new ArrayList<String>();
		//ArrayList<String> a2 = new ArrayList<String>();
		
		/* Adding values to list */
		a1.add("Java");
		a1.add("is");
		a1.add("a");
		a1.add("Object");
		a1.add("Oriented");
		a1.add("Programming");
		a1.add("Language");
		
		/* Printing the List directly */ 
		System.out.println(a1);
		System.out.println("-----------------------------------------");
		
		/* printing using Iterator method() */
		printUsingIterator(a1);
		//System.out.println();
		System.out.println("-----------------------------------------");
		
		/* Finding Size */
		System.out.println("Array List Size : " + a1.size());
		System.out.println("-----------------------------------------");
		
		/* Checking elements exists are not */
		System.out.println("Array List contains : " + a1.contains("Object"));
		System.out.println("-----------------------------------------");
		
		/* Accessing Item using index */
		System.out.println("Get item at Index : " + a1.get(6));
		System.out.println("-----------------------------------------");
		
		/* Checking whether Empty or not */
		System.out.println("Is Empty : " + a1.isEmpty() );
		System.out.println("-----------------------------------------");
		
		/* Modifying/ Setting value by index */
		a1.set(6, "Love");
		printUsingIterator(a1);
		System.out.println("-----------------------------------------");
		
		/* To Remove a value from Array List */
		a1.remove(6);
		System.out.println("After Removing item from array list using index :");
		printUsingIterator(a1);
		System.out.println("-----------------------------------------");
		
		/* Remove all elements */
		a1.removeAll(a1);
		System.out.println("After Removing all elements is : " + a1.isEmpty() );
		System.out.println("-----------------------------------------");
		
	}
	
	public static void printUsingIterator(List<String> arlist) throws Exception {
		Iterator<String> it = arlist.iterator();
		System.out.println("Printing elements using Iterator");
		while(it.hasNext()){
			System.out.println(it.next() + " ");
		}	
	}
	
	public static void arrayListAlgos() throws Exception {
		
		List<String> a2 = new ArrayList<String>();
		/* Adding values to list */
		a2.add("Java");
		a2.add("Is");
		a2.add("A");
		a2.add("Object");
		a2.add("Oriented");
		a2.add("Programming");
		a2.add("Language");
		
		/* Printing the List directly */ 
		System.out.println(a2);
		System.out.println("-----------------------------------------");
		
		/* Sorting */
		Collections.sort(a2);
		System.out.println("After Sorting ");
		System.out.println(a2);
		System.out.println("-----------------------------------------");
		
		/*Reversing List */
		Collections.reverse(a2);
		System.out.println("After reversing ");
		System.out.println(a2);
		System.out.println("-----------------------------------------");
		
//		/* Shuffling List */
//		Collections.shuffle(a2);
//		System.out.println("After Shuffling ");
//		System.out.println(a2);
//		System.out.println("-----------------------------------------");
		
		/* Shuffling List */
		Collections.shuffle(a2, new Random());
		System.out.println("After Shuffling second ");
		System.out.println(a2);
		System.out.println("-----------------------------------------");
		
		
	}
	
}
