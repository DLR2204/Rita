package filehandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx {

	public static void main(String[] args) throws IOException {

		FileReader fr = new FileReader("C:\\Users\\PRADEEP GOUD\\Desktop\\Rita.txt");
		
		int value = fr.read();
		
		while(value!=-1) {
			System.out.println((char)value);
			
			value = fr.read();
		}
		
	}
}
