package classworkoops;

public class UsingCircle {

	 float rr = 20.5f;
	public static void main(String[] args) {

		UsingCircle rj = new UsingCircle();
		System.out.println(rj.rr);
		
		Circle rd = new Circle();
		rd.radius = rj.rr;
		
		rd.area();
		rd.peremeter();

	}

}
