package fileio;

import java.io.FileWriter;
import java.io.IOException;

public class F03_Writer {
	public static void main(String[] args) {
		
		
		FileWriter fw = null;
		
		try {
			fw = new FileWriter("D:\\topsgit\\test.txt");
			String data = "file write practical";
			fw.write(data);
			fw.flush();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}
}
