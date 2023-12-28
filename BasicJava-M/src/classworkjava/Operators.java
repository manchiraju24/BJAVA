package classworkjava;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Arithmetic Operators
		int a = 20;
		int b = 20;
		int add = a + b;
		System.out.println("Addition = " + add);
		
		int sub = a - b;
		System.out.println("Subrtaction = " + sub);
		
		float div = a / b;
		System.out.println("Division = " + div);
		
		int rem = a % b;
		System.out.println("Reminder = " + rem);
		
		System.out.println("*****************************");
		//Relational Operators
		//Comparison Operators
		System.out.println("Greter than : " + (a > b));
		System.out.println("Less than : " + (a < b));
		System.out.println("Greter than and Equal: " + (a >= b));
		System.out.println("Less than and Equal: " + (a <= b));
		//Equality Operators
		System.out.println("Equals : " + (a == b));
		System.out.println("Not Equals : " + (a != b));
		System.out.println("*****************************");
		boolean result = false;
		System.out.println("Boolean value : " + result);
		result = (a>=b) && (a==b);
		System.out.println("AND(true) :" + result);
		result = (a>b) && (a==b);
		System.out.println("AND(false) :" + result);
		result = (a> b) || (a==b);
		System.out.println("OR(True) :" + result);
		result = (a<b) || (a != b);
		System.out.println("OR(False) :" + result);
		System.out.println("*****************************");
		//Unary Operators
		//Post fix Operators
		int z = 10;
		System.out.println("value of z :" + z++);// z = z + 1;
		System.out.println("value of z after post inc(z++) :" + z );
		System.out.println("value of z :" + z--);
		System.out.println("value of z after post decr(z--) :" + z );
		System.out.println("*****************************");
		System.out.println("value of z :" + ++z);// z = z + 1;
		System.out.println("value of z  pre inc(++z) :" + z );
		System.out.println("value of z :" + z--);
		System.out.println("value of z pre decr(--z) :" + z );
		System.out.println("*****************************");
		
		int k =20;
		System.out.println("value of K : " + k);
		System.out.println("value of k (k+=10) =" + (k+=10));
		System.out.println("value of K : " + k);
		System.out.println("value of k (k-=10) =" + (k-=10));
		
		System.out.println("*****************************");
		int m =20;
		int n =5;
		System.out.println("value of m : " + m);
		System.out.println("value of n : " + n);
		System.out.println("value of (m+=n) : " + (m+=n));
		System.out.println("value of (m-=n) : " + (m-=n));
		System.out.println("value of m : " + m);
		System.out.println("value of (m*=n) : " + (m*=n));
		System.out.println("value of m : " + m);
		System.out.println("value of n : " + n);
		System.out.println("value of (m/=n) : " + (m/=n));
		System.out.println("value of m : " + m);
		System.out.println("value of n : " + n);
		System.out.println("value of (m%=n) : " + (m%=n));
		System.out.println("*****************************");
	}

}
