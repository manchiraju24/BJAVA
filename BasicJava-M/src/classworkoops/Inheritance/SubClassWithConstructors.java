package classworkoops.Inheritance;

public class SubClassWithConstructors extends BaseClassConstructor {
	
	 float radius = 0.0f;
	 int side1 = 0;
	 int side2 = 0;
	 int side3 = 0;
	 
	 SubClassWithConstructors(int s, int l ,int w,float r, int s1, int s2, int s3){
		 super(s,l,w);
		 radius = r;
		 side1 = s1;
		 side2 = s2;
		 side3 = s3;	 
	 }
	 public void perimeterOfCircle(){
		 float p = 0.0f;
			p = (float) Math.PI * radius * radius;
			System.out.println("********************************************");
			System.out.println("Radius : " + radius);
			System.out.println("From Child class perimeter of a circle :  " + p );
			System.out.println("********************************************");
		}
	 public void perimeterOfTriangle(){
		 int p = 0;
		 p = side1 + side2+ side3; 
		// System.out.println("********************************************");
		 System.out.println("Triangle Side 1 " + side1);
		 System.out.println("Triangle Side 2 " + side2);
		 System.out.println("Triangle Side 3 " + side3);
		 System.out.println("From Child Class Perimeter of Triangle : " + p );
		 System.out.println("********************************************");
	 }
	 
	public static void main(String[] args) {
	
		SubClassWithConstructors myObj = new SubClassWithConstructors(10, 20, 30,4.5f,40,20,30);
		myObj.peremeterOfRectangle();
		myObj.peremeterOfSquare();
		myObj.perimeterOfCircle();
		myObj.perimeterOfTriangle();

	}

}
