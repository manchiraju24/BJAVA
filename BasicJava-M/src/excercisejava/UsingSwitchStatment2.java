package excercisejava;

import java.util.Scanner;

public class UsingSwitchStatment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fruit;
		System.out.println("Select one fruit ( Apple, Grape, Mango) and enter");
		Scanner f = new Scanner(System.in);
		fruit = f.next();
		
		switch(fruit){
		
		case "Apple":
				System.out.println("Apple fruit color is Red");
				break;
		case "Grape":
				System.out.println("Grape fruit color is Green");
				break;
		case "Mango":
				System.out.println("Mango fruit color is Yellow");
				break;
		default:
				System.out.println("Invalid fruit selection");
		}
		
			
		}
	
	}


