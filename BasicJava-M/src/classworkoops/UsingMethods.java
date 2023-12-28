package classworkoops;

public class UsingMethods {
	

	String name = "Ganesha";
	
	// printName method has access modifier as public
	//public is accessible out side the package
	public void printName(){
		
		System.out.println(name);
	}
	
	// printNamefromArg method has access modifier as default
	//default is accessible within the package not outside the package
	void printNamefromArg(String myName){
		
		System.out.println(myName);
	}
	
	// returnName method has access modifier as private
	
	
	private String returnName(String myFirstName){
		 // When ever we use return value in method (here String) we should use return type inside the method to catch the value;
		 // Private is local to class cannot be accessed out side the class
		//System.out.println(myFirstName);
		return myFirstName;
	}
	public static void main(String[] args) {
	
		UsingMethods myObj = new UsingMethods();
		myObj.printName();
		myObj.printNamefromArg("SaiRam");
		System.out.println(myObj.returnName("Hanuman"));
		
		System.out.println("*******************************");
		
		myObj.returnName("Ayyappa");
		
		String dad = myObj.returnName("Nannaru");
		System.out.println(dad);
		
		System.out.println("*******************************");
		
		AccessModifier myObj1 = new AccessModifier();
		System.out.println(myObj1.city); 
		System.out.println(myObj1.street); 
		
	}

}
