package classworkoops.IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;


public class ByteStreamDemo {

	public static void main(String[] args) throws Exception {
		createNewFileFromString();
		copyFile();
	}
	
	public static void createNewFileFromString() throws Exception {
		FileOutputStream out = null;
		String ft = "This first line in text file";
		System.out.println(System.getProperty("user.dir"));
		
		try {
			
			out = new FileOutputStream("Test_New2.txt");
			out.write(ft.getBytes());
			out.write("\nThis is my second Line".getBytes());
			out.write("\nThis is my Third Line".getBytes());
		} finally {
			if(out != null){
				out.close();
			}
		}
	}
			public static void copyFile() throws Exception {
		
				FileInputStream in = null;
				FileOutputStream out = null;
		
				try {
					in = new FileInputStream("Test_New2.txt");
					out = new FileOutputStream("Test_Copy2.txt");
					int c;
					while((c = in.read()) != -1) {
						out.write(c);
					}
					} finally {
						if(in != null) {
							in.close();
						}
						if(out != null) {
							out.close();
						}
					}
				}
}