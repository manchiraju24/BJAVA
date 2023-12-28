package classworkoops.Inheritance;

public class BaseClassConstructor {
	
	public int side = 0;
	public int length = 0;
	public int width = 0;
	
	public BaseClassConstructor(int s, int l, int w){
		
		side = s;
		length = l;
		width = w;
		
	}
	public void peremeterOfSquare(){
		int p = 0;
		p = 4 * side;
		System.out.println("********************************************");
		System.out.println("Side of Square : " + side);
		System.out.println("From Base class Peremeter of a Square : " + p);	
		//System.out.println("********************************************");
	}
	public void peremeterOfRectangle(){
		int p = 0;
		p = 2 * (length + width);
		//System.out.println("********************************************");
		System.out.println("length of Rectangle : " + length);
		System.out.println("Width of Rectangle : " + width);
		System.out.println("From Base class Peremeter of a Rectangle : " + p);	
	//	System.out.println("********************************************");
	}

}
