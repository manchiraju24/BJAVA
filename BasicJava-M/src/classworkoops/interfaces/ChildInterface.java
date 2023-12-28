package classworkoops.interfaces;

public class ChildInterface implements AreaInterface {

	@Override
	
	public void areaOfCircle() {
		float a =0;
		a = (float)Math.PI * radius * radius;
		System.out.println("Area of Circle : " + a);
	}
	

	
	 public static void main (String[] args){
		 ChildInterface myObj1 = new ChildInterface();
		 myObj1.areaOfCircle();
		
	 }
	
}
