package classworkoops.IO;

import java.io.FileWriter;
import java.io.IOException;

public class CharStreamDemo {

	public static void main(String[] args) throws IOException {
	
		createCharStream();
	}
	
	public static void createCharStream() throws IOException{
			
		FileWriter oStream = null;
		String fileContent = "My first line in char stream";
		
		try{
			
			oStream = new FileWriter("CharStreamFile.txt");
			oStream.write(fileContent);
			oStream.append("\r\nAdding another line");
			
		}finally {
			if(oStream != null){
				oStream.close();
			}	
		}
		System.out.println("File Created");
	}

}
