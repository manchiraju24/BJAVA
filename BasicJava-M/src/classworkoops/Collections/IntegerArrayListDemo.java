package classworkoops.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class IntegerArrayListDemo {

	public static void main(String[] args) throws Exception {
		intArrayList();
	}
	
	public static void intArrayList() throws Exception{
		
		List<Integer> n1 = new ArrayList<Integer>();
		/* Add elements */
		n1.add(10);
		n1.add(20);
		n1.add(30);
		n1.add(40);
		n1.add(50);
		n1.add(60);
		n1.add(70);
		n1.add(80);
		n1.add(90);
		n1.add(100);
		/* print all ArrayList elements directly*/
		System.out.println(n1);
		System.out.println("-----------------------------------------");
		printUsingIterator(n1);
		System.out.println("-----------------------------------------");
		
		/* Finding Size */
		System.out.println("Array List Size : " + n1.size());
		System.out.println("-----------------------------------------");
		

		/* Checking elements exists are not */
		System.out.println("Array List contains : " + n1.contains(20));
		System.out.println("-----------------------------------------");
		
		/* Accessing Item using index */
		System.out.println("Get item at Index : " + n1.get(5));
		System.out.println("-----------------------------------------");
		
		/* Checking whether Empty or not */
		System.out.println("Is Empty : " + n1.isEmpty() );
		System.out.println("-----------------------------------------");
		
		/* Modifying/ Setting value by index */
		n1.set(6, 51);
		printUsingIterator(n1);
		System.out.println("-----------------------------------------");
		
		/* To Remove a value from Array List */
		n1.remove(6);
		System.out.println("After Removing item from array list using index :");
		printUsingIterator(n1);
		System.out.println("-----------------------------------------");
		
		/* Remove all elements */
		n1.removeAll(n1);
		System.out.println("After Removing all elements is : " + n1.isEmpty() );
		System.out.println("-----------------------------------------");

		n1.add(11);
		n1.add(21);
		n1.add(31);
		n1.add(41);
		n1.add(51);
		n1.add(61);
		n1.add(71);
		n1.add(81);
		n1.add(91);
		n1.add(101);
		/* Sorting */
		Collections.sort(n1);
		System.out.println("After Sorting ");
		System.out.println(n1);
		System.out.println("-----------------------------------------");
		
		/*Reversing List */
		Collections.reverse(n1);
		System.out.println("After reversing ");
		System.out.println(n1);
		System.out.println("-----------------------------------------");
		
		/* Shuffling List */
		Collections.shuffle(n1);
		System.out.println("After Shuffling ");
		System.out.println(n1);
		System.out.println("-----------------------------------------");
	}
		public static void printUsingIterator(List<Integer> arlist) throws Exception {
			Iterator<Integer> in = arlist.iterator();
			System.out.println("Printing value from Iterator");
			while(in.hasNext()){
				System.out.println(in.next()  + "");	
			}
		}
			
		}

