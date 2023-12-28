package classworkoops;

public class AutoBoxingUnboxing {

	public static void main(String[] args) {
		
		
		/* Auto Boxing  / Primitive to Object */
		String myVal = "25.5";
		
		float fval = Float.valueOf(myVal);//Converts string value into float
		System.out.println(fval);
		
		int iVal = Integer.valueOf("30"); //We can also pass directly instead of initializing and then converting
										// Converts string value into int
		System.out.println(iVal);
	
		
		int i = 10;
		float j = 12.5f;
		String s1 = Integer.toString(i);//Converting integer value into string
		String s2 = Float.toString(j);// Converting float value into  string
		System.out.println(s1);
		System.out.println(s2);
		
		/*Un boxing /Object to Primitive */
		
		Integer myInt = new Integer(200);
		System.out.println(myInt.toString());// printing integer value
		int o = myInt.intValue();
		System.out.println(o);
		
		Float myFloat = new Float(51.5f);
		float k = myFloat.floatValue();
		System.out.println(k);
		
		
		
	}

}
