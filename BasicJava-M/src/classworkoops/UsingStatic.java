package classworkoops;

public class UsingStatic {
	
	String city = "Vizag";
	static String region = "Venkojipalem";
	static final String gender = "Male";
	// When ever a variable is set as final. 
	//That variable value cannot be changed through out the program
	
	static {
		region = "J R NAGAR";
	}
	
	public void  nonStaticMethod(){
		System.out.println("This is printed from nonStaticMethod   :" + city);
		System.out.println("***********************************");
		System.out.println("This is printed from nonStaticMethod   :" + region);
		System.out.println("***********************************");
	}
	public static void main(String[] args) {
		UsingStatic myObj = new UsingStatic();
		myObj.nonStaticMethod();
		System.out.println("This is printed from Main Method       :" + region);
		System.out.println("***********************************");
		System.out.println(gender);
	}
	
}
