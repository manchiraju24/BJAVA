package classworkjava;

public class UsingArray {

	public static void main(String[] args) {
		
	
		int []  myarray; // Declaration
		myarray = new int [5]; // Initialization
		myarray[0]= 51;
		myarray[1]= 52;
		myarray[2]= 53;
		myarray[3]= 54;
		myarray[4]= 55;
		System.out.println(myarray[0]);
		System.out.println(myarray[1]);
		System.out.println(myarray[2]);
		System.out.println(myarray[3]);
		System.out.println(myarray[4]);
		System.out.println("***********Using for loop**********************");
		
		for(int i=0;i<5;i++){
			System.out.println(myarray[i]);
		}
		
		System.out.println("***********Using for loop with array length**********************");
		for (int i=0; i<myarray.length;i++){
			System.out.println(myarray[i]);
			
		}
		
	}

}
