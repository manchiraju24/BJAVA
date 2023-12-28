package classworkoops.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) throws Exception {
		hashSet1();
		hashSetAlg();
		
		}

		public static void hashSet1() throws Exception {
			
			HashSet<String> hs = new HashSet<String>();
			//ArrayList<String> a2 = new ArrayList<String>();
			
			/* Adding values to list */
			hs.add("Java");
			hs.add("is");
			hs.add("a");
			hs.add("Object");
			hs.add("Oriented");
			hs.add("Programming");
			hs.add("Language");
			
			/* Printing the List directly */ 
			System.out.println(hs);
			System.out.println("-----------------------------------------");
			
			/* printing using Iterator method() */
			printUsingIterator(hs);
			//System.out.println();
			System.out.println("-----------------------------------------");
			
			/* Finding Size */
			System.out.println("Array List Size : " + hs.size());
			System.out.println("-----------------------------------------");
			
			/* Checking elements exists are not */
			System.out.println("Array List contains : " + hs.contains("Object"));
			System.out.println("-----------------------------------------");
			

			
			/* Checking whether Empty or not */
			System.out.println("Is Empty : " + hs.isEmpty() );
			System.out.println("-----------------------------------------");
			
			/* Modifying/ Setting value by index */
			//hs.set(6, "Love");
			printUsingIterator(hs);
			System.out.println("-----------------------------------------");
			
			/* To Remove a value from Array List */
			hs.remove(6);
			System.out.println("After Removing item from array list using index :");
			System.out.println("-----------------------------------------");
			printUsingIterator(hs);
	
			
			/* Remove all elements */
			hs.removeAll(hs);
			System.out.println("-----------------------------------------");
			System.out.println("After Removing all elements is : " + hs.isEmpty() );

		}
		
		public static void printUsingIterator(Set<String> hset) throws Exception {
			Iterator<String> it = hset.iterator();
			System.out.print("Priting Hashset elemnts Using Itertor -->");
			while(it.hasNext()){  
				System.out.print(it.next() + ", ");  
			}
		}
		
		public static void hashSetAlg() throws Exception {
			
			HashSet <String> hs = new HashSet<String>();
			hs.add("Java");
			hs.add("Is");
			hs.add("Object");
			hs.add("Oriented");
			hs.add("Programming");
			hs.add("Language");
			
			System.out.println("-----------------------------------------");
			/* Max */
			System.out.println("Max: "+ Collections.max(hs));
			System.out.println("Min: "+ Collections.min(hs));
			
			
			
		}
			
		}
	


