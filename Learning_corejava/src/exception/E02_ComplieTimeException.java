package exception;

import basic.Sample;

public class E02_ComplieTimeException {
	
	public void demo() throws ClassNotFoundException
	{
		
			Class.forName("basics.Sample");
		
	}
	
	
	public static void main(String[] args) {
		
		
		try 
		{
			Class.forName("basics.Sample");
		} 
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}
