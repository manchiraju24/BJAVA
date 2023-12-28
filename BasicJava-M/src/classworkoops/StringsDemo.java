package classworkoops;

public class StringsDemo {

	public static void main(String[] args) {
		
//		String country = "India"; //Immutable
//		System.out.println(country);
//		
//		country = "Germany";// Deletes old object and creates new object with updated value at compile time
//		System.out.println(country);
//		
//		// Strings are representation of character array char[]
//		
//		char[]  mycountry = {'G','e','r','m','a','n','y'};
//		String  mc = new String(mycountry);
//		System.out.println(mc);
//		
//		// Line no 7 and code written in 15,16,17 both are same.
//		
//		System.out.println("My Country is : " + country + " My Age is : " + 36);
//		System.out.printf("My Country is : %s My Age is : %d" , country , 36);//%s , %d are called formatter 
//		System.out.println();
//		String myStr = String.format("My Country is : %s My Age is : %d" , country , 36);
//		System.out.println(myStr);
//		
		/* String Operations */
		
		String myString = "Java is a object oriented programming language Java";
		String myString1 = " By Maruthi2Systems";
		
		System.out.println("Length of myString : " + myString.length());
		System.out.println("To upper case  :" + myString.toUpperCase());
		System.out.println("To lower case  :" + myString.toLowerCase());
		System.out.println("Orginal myString value : " + myString);
		System.out.println("String Concatination   :  " + myString.concat(myString1));
		System.out.println("Replace whole String : " + myString.replace("Java", "C++"));// All occrrences of Java are converted to C++
		System.out.println("Replace single character  : " + myString.replace("o", "a"));// Can be used to even for single character
		System.out.println("Replace first occurance  : " + myString.replaceFirst("o", "k"));
		System.out.println("Orginal myString value : " + myString);
		System.out.println("Sub String(Begin Index :"  + myString.substring(9));
		System.out.println("Sub String(Begin end :"  + myString.substring(9, 25));
		System.out.println("Contains always return boolean :" + myString.contains("object"));
		System.out.println("Contains always return boolean :" + myString.contains("abject"));
		String[] myObj = myString.split(" ");
		for(String j : myObj){
			System.out.println("Split Element : " +j);
		}
		
		System.out.println("************************");
		System.out.println("Without Trim :" + myString1);
		System.out.println("Trim :" + myString1.trim());
		System.out.println("************************");
		
		String str1 = "Jasritha";
		String str2 = "jasritha";
		System.out.println("String Compare:" + str1.equals(str2));
		System.out.println("String compare with ignore case : " + str1.equalsIgnoreCase(str2));
		System.out.println("************************");
		String str3 = "Jasritha \"M\"";
		System.out.println(str3);
		System.out.println("Replace: " + str3.replace("\"", ".") );
		
	}

}
