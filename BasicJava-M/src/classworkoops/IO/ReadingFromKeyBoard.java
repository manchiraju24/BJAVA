package classworkoops.IO;

import java.io.FileOutputStream;
import java.util.Scanner;

public class ReadingFromKeyBoard {

	public static void main(String[] args) throws Exception {
		creatFile();

	}

	public static void creatFile() throws Exception{
		
		FileOutputStream out = null;
		Scanner scan = new Scanner(System.in);
		
		try {
			 	out = new FileOutputStream("Waste.txt");
				String s = "";
				System.out.println("Enter text -- type End to exsit");
				while(!s.equalsIgnoreCase("End")) {
					s = scan.next();
					out.write(s.getBytes());
					//out.write("\n".getBytes());
				
				}
			} finally {
				
				if(out != null) {
					out.close();
				}
				System.out.println("File Created");
				
			
			}
		
	}
	
}
