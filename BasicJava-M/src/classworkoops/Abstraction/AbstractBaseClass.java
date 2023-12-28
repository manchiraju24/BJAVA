package classworkoops.Abstraction;

public abstract class AbstractBaseClass {
	// We cannot create object  to a Abstract class 
	//Main method can be there in Abstract class

	//AbstractDemo myObj = new AbstractDemo(); compiler wont allow
		
	public int radius = 0;
	public int length = 0;
	public int width = 0;
	public int side = 0;
	
	//Constructor
	AbstractBaseClass(int r, int l ,int w, int s){
		radius = r;
		length = l;
		width = w;
		side = s;
		
	}
	
	public  void areaOfCircle(){
		float area = 0.0f;
		area = (float) Math.PI * radius * radius;
		System.out.println("Area of a circle :  " + area );
	}
	
	public static void myStaticMethod(){
		System.out.println("myStaticMethod called");
	}
	
	public final void myFinalMethod(){
		System.out.println("myFinalMethod");
	}

	public abstract void areaOfRectangle();
	public abstract void areaOfSquare();
	// Abstract method cannot have static and final
	//public abstract static void areaOfRectangle();
	//public abstract final void areaOfRectangle();
	
}
