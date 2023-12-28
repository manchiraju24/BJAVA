package classworkjava;

public class RevisionInstanceVariables {
	
	static String myCountry = "India";
	
	String myState = "Andhra Pradesh";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		int a = 10;
		float f = 104303;
		double d = 33442343;
		String s = "Maruthi";
		char c = 'M';
		byte b = 10;
		long myLong = 2323332232l;
		
		System.out.println(a);
		System.out.println(f);
		System.out.println(d);
		System.out.println(s);
		System.out.println(c);
		System.out.println(b);
		System.out.println(myLong);
		
		//System.out.println(z); cannot call z since it is outside the method.
		
			// to access static variables outside the method
		 	System.out.println(myCountry);
		 	
		 	// Now if I try to access a non static variable outside the method i will get error
		 	//System.out.println(myState);
	
		 	System.out.println(Variable.myState); // We can access the static variable from other classes
		 	// thats the reason static instance variables has less security
		 	
		 	//System.out.println(Variable.country); getting error i cannot access Instance variable from outside the class
		 	
		 	System.out.println("************************************");
		 	RevisionInstanceVariables ding = new RevisionInstanceVariables();
		 	
		 	ding.myMethod1();
		 	System.out.println("************************************");
		 	ding.myMethod2();
		 	System.out.println("************************************");
		}
	
	public void myMethod1() {
		/* Scope of this variable is "z" is with in this method local variable.
		 * Memory is allocated and deleted after running this method
		 *  */
		int z = 20;
		System.out.println(z);
		
		System.out.println(myCountry);
		
		System.out.println(myState);
			}
	
	public void myMethod2(){
		 /* here i am using z again as variable name but will not see any error since the scope of the  z (static)variable is limited
		  *		  to this method myMethod2() */
		int  z = 50;
		System.out.println(z);
		
		{//block variables
		   int a = 20;
		   System.out.println(a); // Scope of this block variable is limited to this block
		   System.out.println(z);// I can access z since it is a variable inside a method
		}
		//System.out.println(a);	I cannot access a outside this block
		
	}
}
