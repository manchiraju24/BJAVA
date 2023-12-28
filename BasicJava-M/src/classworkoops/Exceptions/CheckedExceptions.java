package classworkoops.Exceptions;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class CheckedExceptions {

	public static void main(String[] args) throws FileNotFoundException {
		/* Handling exception using try catch ....  multiple */
		try {
			PrintWriter p = new PrintWriter("SampleMaruthi#?.txt");
			Thread.sleep(2000);
			//p.write("");
			//catch (FileNotFoundException | InterruptedException e)
//		} catch (FileNotFoundException e) {
//			System.out.println("I am in catch block");
//			System.out.println(e.getMessage());
//			
//		}catch (InterruptedException e){
//			e.printStackTrace();
//		}
		}catch (Exception e){
			System.out.println("I am in Exception block");
			e.printStackTrace();
			System.out.println("I am in catch");
		}finally {
			System.out.println("I am in finally block"); //Finally block is compulsory executed after a exception is handled
//			fp.close();
		}
		System.out.println("I am after try catch");
		
		System.out.println("--------------Using Throws--------------");
		PrintWriter p1 = new PrintWriter("Sampl1eMaruthi#?.txt");
		
		System.out.println("I am after PrintWriter Throws");
	}
		

}

