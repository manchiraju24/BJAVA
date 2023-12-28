package excercisejava;

public class Fibonacci {

	public static void main(String[] args) {
		int p1 = 1;
		int p2 = 1;
		System.out.print( p2 + "," + p1 + ",");
		int cun = 0;
		for(int i=1;i<20;i++){
			cun = p1 + p2;
			System.out.print(cun + ",");
			p2 = p1;
			p1 = cun;
			
			
		}
		
	}

}
