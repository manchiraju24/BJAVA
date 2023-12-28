package excercisejava;

public class PrintAtoZUsingArrays {

	public static void main(String[] args) {
		
		String alphabets = ("MaruthiVivekManchiraju");
		
			alphabets = alphabets.toUpperCase();
		
		char[] c = alphabets.toCharArray();
		
		
		for(int i=0;i<c.length;i++){
			System.out.print(c[i] + "  ");
		
			}
		System.out.println();
		System.out.println();
		//Using for each loop
		for(char k : c ){
			System.out.print(k + "  ");
		}
	}

}
