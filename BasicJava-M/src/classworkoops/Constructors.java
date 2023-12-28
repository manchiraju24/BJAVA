package classworkoops;

public class Constructors {
	
	//Class name and method name(Constructor) should be same. 
	//These methods are called only when creating a object of that class.
	//It is used to initialize anything in object constructor is used
	//Constructor doesn't have return type
	float radius=0;
	int side = 0;
	
	
	Constructors(){ 
	//this is called default constructor
	System.out.println("I am constructor1");	
	}
	Constructors(float r){
		System.out.println("I am contructor2");
		radius = r;
	}
	 Constructors(float r, int i) {
		 radius = r;
		 side = i;
		 System.out.println("I am constructor3");
		 System.out.println(radius);
		 System.out.println(side);
	}
	public static void main(String[] args) {

//		Constructors myObj = new Constructors(20.4f);
//		System.out.println(myObj.radius);
//		Constructors myObj1 = new Constructors(22.4f);
//		System.out.println(myObj1.radius);
		
		Constructors conOver = new Constructors();
		System.out.println(conOver.radius);
		Constructors conOver1 = new Constructors(33.5f);
		System.out.println(conOver1.radius);
		Constructors conOver2 = new Constructors(33.5f,6);
		//System.out.println(conOver2.radius);
		
	}

}
