package classworkoops;

import java.util.Scanner;

public class Circle {

	float radius = 0.0f;
	float perimeter = 0.0f;
	float area = 0.0f;
	
	public void area(){
		area =  (float) (Math.PI * radius * radius);
		System.out.println("Area of a Circle = " + area);
	}
	
	public void peremeter(){
		perimeter = (float) (2 * Math.PI * radius);
		System.out.println("Peremeter of a Circle = " + perimeter);
	}
	
	
	public static void main(String[] args) {
	
		
		Circle myObj = new Circle();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Radius of Circle");
		myObj.radius = scan.nextFloat();
		myObj.area();
		myObj.peremeter();	
	}

}
