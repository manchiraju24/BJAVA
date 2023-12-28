package classworkoops.Abstraction;

public class ChildAbstractClass extends AbstractBaseClass {

	ChildAbstractClass(int r, int l, int w, int s) {
		super(r, l, w, s);
	}

	@Override
	public void areaOfRectangle() {
		int a = 0;
		a = length * width;
		System.out.println("Area of Rectangle  : " + a);
	}

	@Override
	public void areaOfSquare() {
		int a = 0;
		a = side * side;
		System.out.println("Area of Square  : " + a);
		
	}
	
//	@Override : Cannot Override final methods
//	public final void myFinalMethod(){
//		
//	} 
		public static void main(String[]args){
			ChildAbstractClass myObj = new ChildAbstractClass(20,30,40,50);
			myObj.areaOfCircle();//non-abstract method calling
			myObj.areaOfRectangle();//Abstract method calling
			myObj.areaOfSquare();//Abstract method calling
			myStaticMethod();// Calling Static method
			myObj.myFinalMethod();//Calling final method
			
		}
	
	
}
