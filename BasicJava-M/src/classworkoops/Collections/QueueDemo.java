package classworkoops.Collections;

import java.util.Iterator;
import java.util.PriorityQueue;

public class QueueDemo {

	public static void main(String[] args) {
		PriorityQueue<String> pq = new PriorityQueue<String>();
		pq.add("Java");
		pq.add("Is");
		pq.add("a");
		pq.add("Object");
		pq.add("Oriented");
		pq.add("Programming");
		pq.add("Language");
		
		System.out.println(pq); // Prints all the elements and doesn't store it in order
		System.out.println("--------------------------------------------------------");
		System.out.println("Head element in queue : " + pq.element());
		System.out.println("--------------------------------------------------------");
		System.out.println("Peek method (First Element in queue) : " + pq.peek());
		System.out.println("--------------------------------------------------------");
		System.out.println("Printing All elements after Peek operation");
		Iterator<String> itr = pq.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		System.out.println("--------------------------------------------------------");
		pq.remove();
		System.out.println("After first remove" + pq);
		System.out.println("--------------------------------------------------------");
		pq.remove();
		System.out.println("After Second remove" + pq);
		System.out.println("--------------------------------------------------------");
		pq.poll();
		System.out.println("Poll" + pq);
		System.out.println("--------------------------------------------------------");
		pq.add("Maruthi");
		System.out.println("Added new element and then printing" + pq);
		
	}

}
