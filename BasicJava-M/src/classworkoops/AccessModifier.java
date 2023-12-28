package classworkoops;

public class AccessModifier {
	
	public static String city = "Vizag";
	static String street = "Venkojipalem"; // can be accessed with in the package not out side the package
	private static String colony = "J R Nagar"; // colony variable cannot be accessed outside the class even with in the package

	public String newColony(){
		return colony;
	}
	
	
	public static void main(String[] args){
		System.out.println(city);
		System.out.println(street);
		System.out.println("Coming from Static variable " + colony);
		System.out.println("*******************************************");	
		AccessModifier j = new AccessModifier();
		System.out.println(j.newColony());
		System.out.println("*******************************************");
	}
}