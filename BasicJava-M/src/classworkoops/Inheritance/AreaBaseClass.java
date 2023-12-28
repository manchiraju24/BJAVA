package classworkoops.Inheritance;

public class AreaBaseClass {
	
	int side = 0;
	float radius = 0.0f;
	float area = 0.0f;
	protected int length = 0;
	protected int breath = 0;
	protected int rectarea = 10;
	
	private int l = 10;
	private int b = 30;
	private int rec = 0;
	
	public void areaOfCircle(){
		area = (float) Math.PI * radius * radius;
		System.out.println("Area of a circle :  " + area );
	}
	
	public void areaOfSquare(){
		area =  radius * radius;
		System.out.println("Area of a Square :  " + area);
	}
	
	public void areaofRectangle(){
		rectarea = length * breath;
		System.out.println("Area of a Rectangle public access modifier:  " + rectarea);
		
	}
	 void areaofRectangle1(){
		rectarea = length * breath;
		System.out.println("Area of a Rectangle default access modifier :  " + rectarea);
	}
	protected void areaofRectangle2(){
			rectarea = length * breath;
			System.out.println("Area of a Rectangle protected access modifier:  " + rectarea);
		}
//	private void areaofRectangle3(){
//		rectarea = length * breath;
//		System.out.println("Area of a Rectangle private access modifier:  " + rectarea);
//	}
	
	public void areaofRectangle4(){
		rec = l * b;
		System.out.println("Area of a Rectangle where we are accessing private variables:  " + rectarea);
	}
	static void myStaticMethod(){
		System.out.println("I am from Static method of AreaBaseClass");
	}
	
	public void subClassMethod(){
		System.out.println("I am from subclassMethod in Base class");
	}
	
}
