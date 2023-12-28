package classworkoops.IO;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileClassDemo {

	public static void main(String[] args) throws Exception {
		//createFile();
		managingFolder();

	}
	
	public static void createFile() throws IOException{
		
	File file = new File("FileDemoNewFile.txt");
	
	if(file.createNewFile()){
		System.out.println("New file created");
	}else{
		System.out.println("File Already Exsists");
		}
			
//	/* Writing to file */
	FileWriter fw = new FileWriter(file);
		fw.write("Adding first line to file");
		fw.append("\r\nAdding second line to file");
	fw.close();
	
	/* Checking file Exists */
		
		System.out.println("File Exist : " + file.exists());
		System.out.println("Get Absolute Path :" + file.getAbsolutePath());
		System.out.println("Get File Name : " + file.getName());
		System.out.println("Get Last Modified : " + file.lastModified());
		System.out.println("Length of char :" + file.length());
		System.out.println("Can Read :" + file.canRead());
		System.out.println("Can Write :" + file.canWrite());
		System.out.println("Is a Directory :" + file.isDirectory());
		System.out.println("Set to Read Only : " + file.setReadOnly());
		System.out.println("Can  to Read file : " + file.canRead());
		System.out.println("Can  to Write to  file : " + file.canWrite());
		System.out.println("Set to write file : " + file.setWritable(true));
		//System.out.println("Rename file and store it in different directory : " + file.renameTo(new File("RenamedFileDemo.txt")));
		System.out.println("Rename file  : " + file.renameTo(new File("RenamedFile10.txt")));
		
		//System.out.println("Delete file : " + file.delete());
		System.out.println("File Exist : " + file.exists());
		
	}
	
	public static void  managingFolder() throws IOException {
		
		File mp = new File("E:\\JavaPractice\\BasicJava-M");
		String fn[] =mp.list();
		for(String fns : fn){
			System.out.println(fns);
		}
		System.out.println("------------------------------------------");
		System.out.println("Is a directory : " + mp.isDirectory());
		System.out.println("Get Parent Direcotry : " + mp.getParent());
		System.out.println("Get Path : " + mp.getPath());
		System.out.println("Is file : " + mp.isFile());
		System.out.println("------------------------------------------");
		
		/* Create Directory */
		File myNewFolder = new File("E:\\JavaPractice\\BasicJava-M\\FileFolder");
		System.out.println( "Folder Created :"+myNewFolder.mkdir());
		
		/* Create Multiple Directory */
		File myNewFolder2 = new File("E:\\JavaPractice\\BasicJava-M\\FileFolder\\FileFolder1\\FileFolder2");
		System.out.println( "Folder Created :"+myNewFolder2.mkdirs());
		
	}
}
