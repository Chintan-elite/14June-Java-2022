package exception;

public class E04_Exception_Overiding {
	
	public void display() throws Exception
	{
		
	}
}


class Demo extends E04_Exception_Overiding
{
	@Override
	public void display() throws ArithmeticException
	{
		
		
	}
}