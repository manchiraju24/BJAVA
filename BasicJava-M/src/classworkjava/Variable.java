package classworkjava;

public class Variable {
	
	String country = "India"; //
	
	// non static variable
	// Instance variable(country) can be accessed by any methods inside a class
	
	static String myState = "Visakhapatnam, AP";
	int q = 4;
	

	public static void main(String[] args) {
		// Variables.
		// Two types of variables Primitive and non primitive data types
		//Primitive = boolean,byte,int,char , float ,long, and double
		
		boolean flag= true;
		byte myByte = 100;
		int myInt = 20;
		char myChar = 'a';
		float myFloat = 10044.4424333f;
		long myLong = 345442242L;
		double myDouble = 334434444D;
		String myName = "Maruthi";
		
		System.out.println("boolean value = " + flag);
		System.out.println("byte =" + myByte);
		System.out.println("Integer value = " + myInt);
		System.out.println("char = " + myChar);
		System.out.println("float = " + myFloat);
		System.out.println("long = " + myLong);
		System.out.println("double = " + myDouble);
		System.out.println(myName);
		
		//	System.out.println("value of a " + a); 
		
		//	System.out.println(country); Static method cannot access non static variables directly
		
		System.out.println(myState); // Since my state is declared as static it can be accessed directly though it is a instance variable 
		
		// To access non static variable need to create object
		
	Variable myObj = new Variable();
	
	System.out.println(myObj.country);
	System.out.println("q value " + myObj.q);
	
	
	myObj.myMath01();
		
	//We can access static instance variables outside the class. 
	
	System.out.println(RevisionInstanceVariables.myCountry);
	System.out.println(myState);

	}
	public void myMath01(){
		
		int a = 4; // local variable
		System.out.println("value of a " + a);
		//System.out.println(myName);
		
		System.out.println(country); // Now country is instance variables. 
		
		{ // block level variable b which can be accessed only with in the block
			int b = 5;
			System.out.println(b);
		}
		
	//	{ If i try to print b i will get error. since b is a block level variable
		//	System.out.println(b);
	//	}
	}
}



