package classworkoops;

public class UsingThisOperator {
	
	String name = "SairamVar";
	String city = "HanumanVar";
	
	UsingThisOperator() {
		System.out.println("I am in contructor1");
	}
	UsingThisOperator(String name, String city){
		System.out.println("I am in contructor2");
		this.name = name;
		this.city = city;
		//System.out.println(name);
	//	System.out.println(city);
	}

	public static void main(String[] args) {
		
		UsingThisOperator myObj = new UsingThisOperator();
		System.out.println(myObj.name);
		System.out.println(myObj.city);
		
		UsingThisOperator myObj1 = new UsingThisOperator("Shiva","Indra");
		System.out.println(myObj1.city);
		System.out.println(myObj1.name);
		
	}

}
