package classworkoops;

public class Overloading {
	
	int a = 5;
	float area = 0.0f;
	float radius = 4.5f;
	int lenght = 10;
	int width = 24;
	
	public void area(int s){
		area = (float)s * s;
		System.out.println("Area of a Square    :" + area);
	}
	
	public void area(int l,int b){
		area = (float)l * b;
		System.out.println("Area of a Rectangle :" + area);
	}
	
	public float area (float r){
		
		 area = (float) Math.PI * r *r;
		System.out.println("Area of a Square    :"   + area);
		return area;
	}
	
	public static void main(String[] args) {
		
		Overloading myObj = new Overloading();
		myObj.area(5);
		myObj.area(25, 6);
		myObj.area(10.0f);
		
	}

}
