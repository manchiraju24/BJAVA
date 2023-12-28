package classworkoops.IO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		createBufferedFile();

	}
	
	public static void createBufferedFile() throws IOException {
		
		BufferedWriter bw = null;
		FileWriter fw = null;
		
		String myString = "This is my first line using buffered stream \r\n" ;
		
		try {
			
			fw = new FileWriter("MyCharBufered.txt");
			bw = new BufferedWriter(fw);
			
			bw.write(myString);
			bw.append("Appending new line \r\n");
			bw.append("End of line \r\n");
			bw.flush(); // It will write to the file
			bw.append("Appending new line after flush \r\n");
			}finally{
			
				if(bw != null){
					bw.close();
				}
				if(fw != null){
					fw.close();
				}
		}
		System.out.println("file Created");
	}
	
	public static void copyBufferedFile() throws IOException{
		
		BufferedReader inputstream = null;
		BufferedWriter outstream = null;
		
		FileReader fr = null;
		FileWriter fw = null;
		
		try{
			
			fr = new FileReader("MyCharBufered.txt");
			fw = new FileWriter("CopyMYCharBufered.txt");
			
			inputstream = new BufferedReader(fr);
			outstream = new BufferedWriter(fw);
			
			String l = null;
			
			while((l= inputstream.readLine()) != null){
				
				outstream.write(l);
				outstream.write("\r\n");	
			}
		}finally{
			
			if(inputstream != null){
				inputstream.close();
			}
			
			if(outstream != null){
				outstream.close();
			}
			
			}
		
		
	}
}
