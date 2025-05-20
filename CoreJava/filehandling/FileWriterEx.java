package filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {
	
	public static void main(String[] args) throws IOException {
		
		
		FileWriter fw = new FileWriter("C:\\Users\\PRADEEP GOUD\\Desktop\\Rita.txt");
		
		fw.write("goodMorning");
		
		fw.write(1234);
		
		fw.write('c');
		
//		fw.write(3.14f);
//		
//		fw.write(true);
		
		char ch[] = {'a','c','e','w'};
		
		fw.write(ch);
		
		fw.flush();
		
		fw.close();
		
		
		System.out.println("Written into the file successfully");
	}
//it will not accept the float,boolean values
	
//it cant read int values	
	
//no new line option
}
