package fileio;

import java.io.File;
import java.io.IOException;

public class F04_file {
	public static void main(String[] args) {
		
		
		File file = new File("D://topsgit//tops");
		
		System.out.println(file.isFile());
		System.out.println(file.isDirectory());
		
		//file.mkdir();
		
//		if(file.exists())
//		{
//			System.out.println("file available");
//			file.delete();
//			System.out.println("file deleted...");
//		}
//		else
//		{
//			System.out.println("no file is there !!");
//			try {
//				file.createNewFile();
//				System.out.println("file created...");
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
		
		
	}
}
