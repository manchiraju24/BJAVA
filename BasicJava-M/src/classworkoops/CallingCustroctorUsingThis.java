package classworkoops;

public class CallingCustroctorUsingThis {
	String fname = "SairamVar";
	String lname = "HanumanVar";
	
	CallingCustroctorUsingThis() {
		this("Venkata", "Narasimha"); //when we are calling "this" call, it should be first statement 
		System.out.println("I am in contructor1");
	}
	CallingCustroctorUsingThis(String name, String city){
		System.out.println("I am in contructor2");
		this.fname = name;
		this.lname = city;
		System.out.println(name);
		System.out.println(city);
	}

	public static void main(String[] args) {
		
		CallingCustroctorUsingThis myObj = new CallingCustroctorUsingThis();
		System.out.println(myObj.fname);
		System.out.println(myObj.lname);
		
		CallingCustroctorUsingThis myObj1 = new CallingCustroctorUsingThis("Shiva","Indra");
		System.out.println(myObj1.fname);
		System.out.println(myObj1.lname);
		
	}


}
