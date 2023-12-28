package classworkoops.Inheritance;

public class OverRiding extends AreaBaseClass {
	
	@Override
	public void areaOfSquare(){
		area =  9 * 9;
		System.out.println("Area of a Square from Subclass OverRiding:  " + area);
	}
	
//	@Override
//	static void myStaticMethod(){ // not allowed when we try to override static method which is in Base class
//		System.out.println("I am from Static method of OverRiding Class");
//	}
	
	
	// Static methods cannot be override @Override
	
	static void myStaticMethod(){ // This is allowed  in Base class this is a Static method and here also static method 
	System.out.println("I am from Static method of OverRiding Class");
}
	
//	static void subClassMethod(){ // When Base class has instance method we cannot override it using static method
//		System.out.println("I am from subclassMethod in Base class");
//	}

	public static void main(String[] args) {	
		OverRiding obj = new OverRiding();
		// AreaBaseClass obj = new OverRiding(); this is called Runtime Polymorphis
		obj.areaOfSquare();
		myStaticMethod();
		
	}
	


}
