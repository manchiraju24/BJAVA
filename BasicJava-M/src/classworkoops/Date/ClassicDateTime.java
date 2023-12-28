package classworkoops.Date;

import java.util.Date;

public class ClassicDateTime {

	public static void main(String[] args) throws Exception {
		
		simpleDate();
	}
	
	public static void simpleDate() throws Exception{
		
		Date d = new Date();
		System.out.println("---------------------------------");
		System.out.println("Date Present date : " + d.toString());
		System.out.println("---------------------------------");
		System.out.println("Only Time : " + d.getTime());
		System.out.println("---------------------------------");
	//	Thread.sleep(5000);
		Date d1 = new Date();
		System.out.println("Date Present date : " + d1.toString());
		System.out.println("---------------------------------");
		System.out.println("Date1 to Date comparison :" + d1.compareTo(d));
		System.out.println("Date to Date1 comparison :" + d.compareTo(d1));
		System.out.println("---------------------------------");
		System.out.println("Compar with new date :" + d1.compareTo(new Date()));
		System.out.println("---------------------------------");
		System.out.println("After :" + d.after(d1));
		
	}
	

}
