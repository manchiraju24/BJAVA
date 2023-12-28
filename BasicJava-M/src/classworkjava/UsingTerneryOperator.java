package classworkjava;

import java.io.InputStream;
import java.util.Scanner;

public class UsingTerneryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=0;
		boolean iseven = false;
		
		System.out.println("Enter first Number");
		
		Scanner z = new Scanner(System.in);
		a = z.nextInt();
		
		iseven=(a%2==0)? true : false;
		System.out.println("Number entered is even =" + iseven);
		
		System.out.println("*************************************");
		test1();
		
		UsingTerneryOperator h = new UsingTerneryOperator();
		h.test2();
		
	}

	
	public static void test1(){
		
		int k=0;
		boolean evenf = false;
	
		System.out.println("Enter Second Number");
		Scanner l = new Scanner(System.in);
		k = l.nextInt();
		evenf=(k%2==0)? true : false;
		System.out.println("number is even from method test1  "  +  evenf);
		System.out.println("*************************************");
		
	}
	public void test2(){
		
		int k=0;
		boolean evenf = false;
	
		System.out.println("Enter third Number");
		Scanner l = new Scanner(System.in);
		k = l.nextInt();
		evenf=(k%2==0)? true : false;
		System.out.println("number is even from method test2  "  +  evenf);
		System.out.println("*************************************");
		
		
	}
}
