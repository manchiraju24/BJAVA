package excercisejava;

public class AvarageOfNumbers {

	public static void main(String[] args) {
		
		int i = 1;
		float avg = 0;
		int sum = 0;
		do {
			sum = sum + i;
			i++;
		   } while(i<=100);
		    System.out.println("Sum = " + sum );
		    
		    avg = sum/100;
		    System.out.println("Avg " + avg);
		  
			
		
	}

	}
