package classworkjava;

public class UsingIfcondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//SimpleIf();
		//elseIf();// I can call static methods directly 
		//simpleIfLadder();
		//nestedIf();
		ifLadderEven();
		
	}
		 static void SimpleIf(){
		int a = 9;
		if(a%2 == 0){
			System.out.println("a is even");
		}
		System.out.println("I am after if statment");
		System.out.println("****************************");
		}
		public static void elseIf(){ // if i remove static and use public void ElseIf to call i need to create a object to call this method
			int a = 9;
			if(a%2 == 0){
				System.out.println("a is even");
				System.out.println("****************************");
			}else {
				System.out.println("a is odd");
				System.out.println("****************************");
			}
		}
		public static void simpleIfLadder(){
			int a = 20;
			int b = 20;
			if(a > b){
				System.out.println("a is greater than b");
				System.out.println("****************************");
				}else if(a < b){
					System.out.println("a is less than b");
					System.out.println("****************************");
				}else {
					System.out.println("a is equals b");
					System.out.println("****************************");
				}
			
			}
		
		public static void nestedIf(){
			int a = 9;
			int b = 20;
			if(a > b){
				System.out.println("a is greater than b");
				System.out.println("****************************");
				}else{
					if(a <b){
						System.out.println("a is less than b");
						System.out.println("****************************");
					}else{
						if(a == b){
							System.out.println("a is equals b");
							System.out.println("****************************");
						}
					}
				}
			
			}
		public static void ifLadderEven(){
			int a = 25;
			int b = 9;
			if(a > b){
				System.out.println( "a is greater than b");
				System.out.println("****************************");
				if(a%2 == 0){
					System.out.println("a is even");
					System.out.println("****************************");
				}else {
					System.out.println("a is odd");	
					System.out.println("****************************");
				}
			}else if(a < b){
				System.out.println( "a is less than b");
				System.out.println("****************************");
				if(a%2 == 0){
					System.out.println("a is even");
					System.out.println("****************************");
				}else {
					System.out.println("a is odd");	
					System.out.println("****************************");
				}
			}else {
				System.out.println( "a equals b");
				System.out.println("****************************");
				if(a%2 == 0){
					System.out.println("a is even");
					System.out.println("****************************");
				}else {
					System.out.println("a is odd");	
					System.out.println("****************************");
				}
				
			}

			}

}