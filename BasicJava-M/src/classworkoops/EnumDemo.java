package classworkoops;

public class EnumDemo {

	public static void main(String[] args) {
		
		WeekDayEnum day = WeekDayEnum.Saturday;// calling variables
		System.out.println(day.toString());// we are using toString to convert the constants to string 
		System.out.println("********************************");
		// Printing using Enumerator  literal
		System.out.println(WeekDayEnum.Friday);
		System.out.println("********************************");
		// To Print all enum constants
		
		WeekDayEnum[] myEnum = WeekDayEnum.values();
		for(WeekDayEnum i: myEnum){
			System.out.println(i);
		}
		System.out.println("********************************");	
		
		//Printing using valueOf
		System.out.println(WeekDayEnum.valueOf("Friday"));
		
	}

}
