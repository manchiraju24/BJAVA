package classworkoops.Inheritance;

public class UsingSuperKeyWord extends AreaBaseClass {
	float radius = 0;
	
	public void assignRadius(){
		radius = 5;
		super.radius = 9;
		System.out.println(radius);
	}
	
	public void printAreaOfCircle(){
		System.out.print("Area of a Circle   : ");
		System.out.println(Math.PI * radius * radius);
	}
	public void areaOfCircle(){
		super.areaOfCircle();
	}
	public static void main(String[] args) {
		UsingSuperKeyWord  myObj = new UsingSuperKeyWord();
		myObj.assignRadius();
		myObj.printAreaOfCircle();
		myObj.areaOfCircle();
	}
	
}
	

