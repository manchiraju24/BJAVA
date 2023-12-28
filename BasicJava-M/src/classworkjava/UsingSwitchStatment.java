package classworkjava;

import java.util.Scanner;

public class UsingSwitchStatment {

	public static void main(String[] args) {
		
		int a = 0;
		System.out.println("Enter a number 1- 10");
		Scanner j = new Scanner(System.in);
		a = j.nextInt();
		
		switch(a){
		
		case 1: 
			System.out.println("Entered number is One");
			break;
		case 2:
			System.out.println("Entered number is Two");
		case 3: 
			System.out.println("Entered number is Three");
			break;
		case 4:
			System.out.println("Entered number is Four");
		case 5: 
			System.out.println("Entered number is Five");
			break;
		case 6:
			System.out.println("Entered number is Six");
			break;
		case 7: 
			System.out.println("Entered number is Seven");
			break;
		case 8:
			System.out.println("Entered number is Eight");
		case 9: 
			System.out.println("Entered number is Nine");
			break;
		case 10:
			System.out.println("Entered number is Ten");
			break;
		default :
			System.out.println("Entered number is Invalid Number");
		}
		
	
	}

}
