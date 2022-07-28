package fileio;



import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class F01_OutputStream {
	public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
			System.out.println("enter name : ");
			String name = sc.next();
			System.out.println("enter emial : ");
			String email = sc.next();
			FileOutputStream fos = null;
			try {
		
				 fos = new FileOutputStream("D:\\topsgit\\"+name+".txt");
				//System.out.println("file created...");
				//String  data = "this is my first io practical";
				byte b[] = email.getBytes();
				fos.write(b);
			
			
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			finally {
				sc.close();
				try {
					fos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
	}
}
