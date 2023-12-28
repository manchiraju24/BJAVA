package classworkoops.Collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) throws Exception {
		hashMap();
	}
	
	public static void hashMap() throws Exception {
		
		Map<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(100, "Maruthi");
		hm.put(101, "is");
		hm.put(102, "learning");
		hm.put(103, "Java");
		
		System.out.println("Printing All Elements" + hm);
		System.out.println("--------------------------------------------------------");
		System.out.println("Size of Map : " + hm.size());
		System.out.println("--------------------------------------------------------");
		
		/* Accessing element by Key */
		System.out.println("Get element 102 : " +hm.get(102));
		System.out.println("--------------------------------------------------------");
		
		/* First Replace */
		hm.replace(101, "Jasritha");
		System.out.println("After Replacing is with Jasrith printing all elements ");
		System.out.println(hm);
		System.out.println("--------------------------------------------------------");
		
		/* Second Replace : In this replace if Maruthi is not identified then it will not replace with Manchiraju*/
		hm.replace(100,"Maruthi", "Manchiraju");
		System.out.println("After Replacing is with Maruthi with Manchiraju printing all elements ");
		System.out.println(hm);
		System.out.println("--------------------------------------------------------");
		
		System.out.println("Key Set : " +hm.keySet());
		System.out.println("--------------------------------------------------------");
		System.out.println("Value Set : " + hm.values());
		System.out.println("--------------------------------------------------------");
		
		
	}
}
