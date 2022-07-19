package oops;

interface I1
{
	public void display();
}
interface I2
{
	public static final int a = 10;
	public void display();
	public void run();
}
class Interdemo 
{
	
}
class InterImpl extends Interdemo implements I1,I2
{

	@Override
	public void display() {
		System.out.println("running displa");
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
}

public class S014_InterfaceDemo {
	public static void main(String[] args) {
		 InterImpl imp = new InterImpl();
		 imp.display();
		 
		
		
	}
}
