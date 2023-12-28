package excercisejava;

import java.util.Scanner;

public class Emicalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double p ;
		short n;
		float r ;
		double emi;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter principal amount in integers");
		p = scan.nextDouble();
		System.out.println("Enter principal rate of intrest");
		r = scan.nextFloat();
		System.out.println("Enter number of years");
		n = scan.nextShort();
		
		double rp = Math.pow(1+r/12/100,n*12);
		emi = p * r * (rp/ (rp-1));
		//System.out.println(emi);
		System.out.println(Math.round(emi));
		
		
	}

}
