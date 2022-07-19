package oops;



abstract class Abs
{
	public  abstract void display();
	
	public void run()
	{
		System.out.println("runing run method...");
	}
}

class AbsImpl extends Abs
{

	@Override
	public void display() {
		System.out.println("runinng display");
	}
	
}

public class S013_AbstractClassDemo {
	public static void main(String[] args) {
		
		AbsImpl abs = new AbsImpl();
		abs.display();
		abs.run();
		
		
		
	}
}
