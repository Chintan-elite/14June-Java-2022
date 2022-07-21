package exception;

public class E01_ExceptionDemo {
	public static void main(String[] args) {
		
		
		System.out.println("Program started...");
		
		
		try 
		{
//			int i = 10;
//			int j = i/0;
			
			int a[] = new int[5];
			a[7] = 20;
		}
		catch (ArithmeticException e)
		{
			e.printStackTrace();
		}
		catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("always executable !!!");
		}
		System.out.println("Program ended..");
		
//		E02_ComplieTimeException a = new E02_ComplieTimeException();
//		try {
//			a.demo();
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
	}
}
