package classworkjava;

import java.util.Scanner;

public class CompoundIntrest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int t = 0;
		int p = 0;
		double amount = 0.0d;
		float r = 0;
		
		Scanner d = new Scanner(System.in);
		 
		System.out.println("Enter tenure in Years");
		t = d.nextInt();
		System.out.println("Enter Principle");
		p = d.nextInt();
		System.out.println("Enter Rate of intrest");
		r = d.nextFloat();	
		amount = p * Math.pow((1 + r/100), t);
		System.out.println("Amount =" + amount);
		
	}

}
