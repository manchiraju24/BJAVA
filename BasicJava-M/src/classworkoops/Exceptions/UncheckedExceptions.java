package classworkoops.Exceptions;

public class UncheckedExceptions {

	public static void main(String[] args) {
		
		int a = 6;
		int b = 0;
		try {
			float result = a/b;
			System.out.println(result);
		}catch(ArithmeticException e){
			System.out.println("I am in catch block");
		}
		System.out.println("I am after exception");
		
		//When we run this program we come to know that exception occurred these are called unchecked exceptions
	}

}
