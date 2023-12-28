package classworkoops.interfaces;

public class MultiInterface implements AreaInterface, PerimeterCircle {

	

	@Override
	public void permieterCir() {
		float p = 0;
		p = (float) (2 * ( Math.PI * r));
		System.out.println("Perimeter Of a Circle : " + p);
	}
	
	@Override
	public void areaOfCircle() {
		float a =0;
		a = (float)Math.PI * radius * radius;
		System.out.println("Area of Circle : " + a);
	}

	public static void main(String[] args) {
		MultiInterface myObj1 = new MultiInterface();
		myObj1.areaOfCircle();
		myObj1.permieterCir();
		

	}

	//@Override
//	public void printRadius() {
		// TODO Auto-generated method stub
		
	}


