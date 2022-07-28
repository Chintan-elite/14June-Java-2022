package exception;

public class MyOwnException extends RuntimeException
{
	public void msg()
	{
		System.out.println("Insufficient fund exception");
	}
}
