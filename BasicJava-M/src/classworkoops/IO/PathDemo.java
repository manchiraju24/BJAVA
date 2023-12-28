package classworkoops.IO;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Path p = Paths.get("E:\\JavaPractice\\BasicJava-M\\src\\classworkoops\\IO");
		
		System.out.println("Get file Name : " + p.getFileName());
		System.out.println("Folder Structure" + p.toString());
		System.out.println("Folder Count from root folder : " +p.getNameCount());
		System.out.println("Parent folder : " + p.getParent());
		System.out.println("Get Name of the Root folder0 : " + p.getName(0));
		System.out.println("Get Name of the  folder1 : " + p.getName(1));
		System.out.println("Get Name of the Root folder2 : " + p.getName(2));
		System.out.println("Get Name of the Root folder3 : " + p.getName(3));
		System.out.println("Get SubPat : " + p.subpath(0, 5));
		
	}
	

}
