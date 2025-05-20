package filehandling;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWriterEx {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		PrintWriter pw = new PrintWriter("C:\\Users\\PRADEEP GOUD\\Desktop\\Rita.txt");
	
		pw.println("goood evening");
		
		pw.println(12323);
		
		pw.println('c');
		
		pw.println(3.14f);
		
		pw.println(true);
		
		char ch[] = {'a','v','e','e'};
		
		pw.println(ch);
		
		pw.flush();
		
		pw.close();
		
		System.out.println("Written into the file successfully");
	
	
	}

}
