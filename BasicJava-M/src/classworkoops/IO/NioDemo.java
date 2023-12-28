package classworkoops.IO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NioDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//creatfile();
		creatDirectory();
	}
	
	public static void creatfile() throws IOException{
		
		String filecontent = "Manchiraju Jasritha is a good girl";
		Path  path = Paths.get("ManchirajuFileUsingPath.txt");
		Files.write(path, filecontent.getBytes());
		System.out.println("File Created using Files Path");
		System.out.println("To Get the newly created file name : " + path.getFileName());	
	}
	
	public static void creatDirectory() throws IOException{
		Path p1 = Paths.get("E:\\JavaPractice\\BasicJava-M\\NioDir#$&");
		
		if(!Files.exists(p1)){
//			Files.createDirectories(p1);
//			System.out.println("Directory Created");
//		}else{
//			System.out.println("Directory Already exists");
			try{
				Files.createDirectories(p1);
			}catch (Exception e){
				e.printStackTrace();
			}
		}
		System.out.println("Directory Created");
	}
}
