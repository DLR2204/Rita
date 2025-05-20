package filehandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterEx {
	
	public static void main(String[] args) throws IOException {
		
		FileWriter fw = new FileWriter("C:\\Users\\PRADEEP GOUD\\Desktop\\Rita.txt");
		
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write("goodMorning");
		
		bw.newLine();
		
		bw.write(1234);
		
		bw.newLine();
		
		bw.write('c');
		
		bw.newLine();
		
//		bw.write(3.14f);
//		
//		bw.write(true);
		
		char ch[] = {'a','c','e','w'};
		
		bw.write(ch);
		
		bw.flush();
		
		bw.close();
		
		
		System.out.println("Written into the file successfully");
	
//it will not accept the float,boolean values
	
//it cant read int values	
	

	}

}
