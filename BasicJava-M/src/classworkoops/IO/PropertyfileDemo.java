package classworkoops.IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyfileDemo {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fm = new FileInputStream("E:\\JavaPractice\\BasicJava-M\\src\\classworkoops\\IO\\MyApp.properties");
		
		Properties pop = new Properties();
		pop.load(fm);
		
		System.out.println("Get Property value of URL : " + pop.getProperty("url"));
		System.out.println("Get Property value of Browser : " + pop.getProperty("browser"));
		System.out.println("Get Property value of username :  " + pop.getProperty("username"));
		System.out.println("Get Property value of password :  " + pop.getProperty("password"));
	}

}
